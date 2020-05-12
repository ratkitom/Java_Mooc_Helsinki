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
public class Player implements Cordinates {
    
    private String sign;
    private int xCordinate;
    private int yCordinate;
    
    public Player(){
        sign="@";
        xCordinate=0;
        yCordinate=0;
    
    }
    
    public String getSign(){
    
    return sign;
    }
    
    public int getX(){
    
        return xCordinate;
    }
    
    public int getY(){
    
        return yCordinate;
    }
    
    public void moveLeft(){
        
        xCordinate=xCordinate-1;
            
    }
    
    public void moveRight(){
    
        xCordinate=xCordinate+1;
    
    }
    
    public void moveUp(){
    
        yCordinate=yCordinate-1;
    }
    
    public void moveDown(){
        
        yCordinate=yCordinate+1;
    
    }
}
