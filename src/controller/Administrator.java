package controller;

import java.util.ArrayList;
import java.util.List;
import tv.View;
import logic.GameLogic;
import model.GameObject;
import mvvm.Data;
import net.DataParser;
import net.DummyNetworkManager;
import net.INetworkManager;

/** Main controller of the game, 
 *  responsible for retrieving and keeping data from network,
 *  and also starting different components of the game
 */

public class Administrator {

    private final View view;
    private final GameLogic game;
    private final DataParser dataParser;
    private final List<GameObject> gameObjects;
    private INetworkManager network;
    private List<Data> data;

    /* lazy instantiation of the singleton Administrator */
    private static class InstanceHolder {
        public static final Administrator instance = new Administrator();
    }

    public static Administrator getInstance() {
        return InstanceHolder.instance;
    }

    public Administrator() {
        data = new ArrayList<>();
        
        //models
        gameObjects = new ArrayList<>();
        //logic
        game = new GameLogic();
        //graphics
        view = new View();
        //network
        network = new DummyNetworkManager(); //does nothing!!
        dataParser = new DataParser();
    }

    /**
     * starts main components of the game
     * @see INetworkManager
     * @see GameLogic
     * @see View
     */
    public void start() {
        network.connect();
        new DataUpdater().start();

        game.start();
        view.start();
    }
    
    public List<Data> getData() {
        return data;
    }

    /**
     * used by the game logic to do calculations
     * @return game objects
     * @see GameLogic
     */
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    /**
     * calls retrieve data on a time basis,
     * @author it would be better to make a timer instead!
     */
    private class DataUpdater {
       
        private final Runnable update = () -> {
            while (true) {
                this.retrieveData();
                try {
                    Thread.sleep(32); // sync with view later
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } 
            }
        };

        public void start() {
            new Thread(this.update).start();
        }

        /**
         * recieves data from network
         * @see Data
         * @see INetworkManager
        */
        private void retrieveData() {
            final List<Data> retrievedData =  network.retrieveData();
            if (retrievedData != null) {
                // this is the part things are prone to bug..
                // it depennds on our design: either we always send all data or we only send new data from server
                data = retrievedData;
                gameObjects.addAll(
                    dataParser.parse(retrievedData)
                    );
            }
        }
    }
}