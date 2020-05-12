/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author W
 */
public class Worm {

    private int x;
    private int y;
    private Direction direction;
    private List<Piece> worm;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.worm = new ArrayList<Piece>();
        this.worm.add(new Piece(x, y));
        this.grow = false;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return worm.size();
    }

    public List<Piece> getPieces() {
        return worm;
    }

    public void move() {
        
        
   switch(direction){
            case UP: y-=1;
            break;
            case DOWN: y+=1;
            break;
            case RIGHT: x+=1;
            break;
            case LEFT: x-=1;
        
            
        }
   
    if(getLength()<3 || grow){
        worm.add(new Piece(x,y));
        grow=false;
   
   }  
    
    else{
    
    worm.remove(0);
    worm.add(new Piece(x,y));
    
    }
  
    }

    public void grow() {
 
        grow = true;
    }

    public boolean runsInto(Piece piece) {
        for (int i = 0; i < getLength(); i++) {
            if (worm.get(i).getX() == piece.getX() && worm.get(i).getY() == piece.getY()) {
                return true;
            }
        }

        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < getLength() - 1; i++) {
            if (head().getX() == worm.get(i).getX() && head().getY() == worm.get(i).getY()) {
                return true;
            }
        }

        return false;
    }

    public Piece head() {
        return worm.get(getLength() - 1);
    }
}
     
     

