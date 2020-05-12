/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;

/**
 *
 * @author tomasz
 */
public class Circle extends Figure {
    
    private int dimeter;
    
    public Circle(int x,int y,int dimeter){
    
        super(x,y);
        this.dimeter=dimeter;
        
        
        
    }

    @Override
    public void draw(Graphics graphics) {
        
        graphics.setColor(Color.BLACK);
        
        graphics.fillOval(super.getX(),super.getY(),dimeter,dimeter);
        
        
        
        
    }
    
    
    
    
    
    
}
