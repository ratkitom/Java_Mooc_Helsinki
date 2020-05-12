/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author tomasz
 */
public interface Cordinates {
    
    int getX();
    int getY();
    String getSign();
    void moveLeft();
    void moveRight();
    void moveUp();
    void moveDown();
}
