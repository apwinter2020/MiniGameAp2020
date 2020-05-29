package model;

import logic.GameLogic;
import listeners.Collidable;
import listeners.IAnimate;
import listeners.Movable;
import mvvm.Data;

/** controlled by the logic of the game
 * @see GameLogic
 */
public interface GameObject extends Movable, Collidable, IAnimate {
    
    /**
     * use this before sending objects to the network stream
     */
    Data toData();
}