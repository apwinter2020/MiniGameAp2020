package net;

import java.util.List;
import java.util.stream.Collectors;

import model.GameObject;
import mvvm.Data;
import shape.Circle;

/** capable of converting list of data to game objects
 * @see Data 
 * @see GameObject
 */
public class DataParser {

    /**
     * @param data
     * @return game objects (converted from data)
     */
    public List<GameObject> parse(List<Data> data) {
        return data.parallelStream()
            .map(this::convertToGameObject)
            .collect(Collectors.toList());
    }

    private GameObject convertToGameObject(Data data) {
        switch (data.getType()) {
            case OVAL:
            return new Circle(data);
            default:
                return null;
        }
    }
}