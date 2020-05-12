/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author tomasz
 */
public class PersonalBoard extends GameOfLifeBoard  {
    
   
   public PersonalBoard(int width, int height) {
        super(width, height);
       
        
    }

    @Override
    public void initiateRandomCells(double d) {
       
        Random rand=new Random();
        
        for(int i=0;i<getBoard().length;i++){
        
                
            
            for(int j=0;j<getBoard()[i].length;j++){
        
                if(rand.nextDouble()<=d){
                
                    getBoard()[i][j]=true;
                
                }
                
            
        }
        
        
        }
        
        
        
    }

    @Override
    public boolean isAlive(int i, int i1) {
         if((i>=0 && i<=getBoard().length-1) && (i1>=0 && i1<=getBoard()[0].length-1)) return getBoard()[i][i1];
         return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if((i>=0 && i<=getBoard().length-1) && (i1>=0 && i1<=getBoard()[0].length-1)) getBoard()[i][i1]=true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        if((i>=0 && i<=getBoard().length-1) && (i1>=0 && i1<=getBoard()[0].length-1)) getBoard()[i][i1]=false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        
        int neighboursAlive=0;
        
      if(i>0&&i1>0){
        
        for(int j=i-1;j<i+3;j++){
        
        for(int k=i1-1;k<i1+3;k++){
        
              if(isAlive(j,k)) neighboursAlive++;
        }
        
        
        }
        
        if(isAlive(i,i1)) return neighboursAlive-1;
        
        return neighboursAlive;
        
      } else if(i==0&& i1==0){
          
          if(isAlive(1,0)) neighboursAlive++;
          if(isAlive(1,1)) neighboursAlive++;
          if(isAlive(0,1)) neighboursAlive++;
      
          return neighboursAlive;
      
        } else if(i==0&& i1==getBoard()[0].length-1){
        
            if(isAlive(0,i1-2)) neighboursAlive++;
            if(isAlive(1,i1-2)) neighboursAlive++;
            if(isAlive(1,i1-1)) neighboursAlive++;
        
            return neighboursAlive;
            
        }  else if(i==getBoard().length-1 && i1==0){
        
            if(isAlive(i-2,0)) neighboursAlive++;
            if(isAlive(i-2,1)) neighboursAlive++;
            if(isAlive(i-1,1)) neighboursAlive++;
            return neighboursAlive;
        
        } else if(i==0 && i1>0){
        
            if(isAlive(0,i1-1)) neighboursAlive++;
            if(isAlive(0,i1+1)) neighboursAlive++;
            if(isAlive(1,i1-1)) neighboursAlive++;
            if(isAlive(1,i1)) neighboursAlive++;
            if(isAlive(1,i1+1)) neighboursAlive++;
            return neighboursAlive;
                
            
        }  else if(i==getBoard().length-1 && i1>0){
        
            if(isAlive(i,i1-1)) neighboursAlive++;
            if(isAlive(i,i1+1)) neighboursAlive++;
            if(isAlive(i-1,i1-1)) neighboursAlive++;
            if(isAlive(i-1,i1)) neighboursAlive++;
            if(isAlive(i-1,i1+1)) neighboursAlive++;
            return neighboursAlive;
            
            
            
        }      
      
        return neighboursAlive;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        
        if(i2<2||i2>3){
        
            turnToDead(i,i1);
        
        } else if(i2==3){
        
            turnToLiving(i,i1);
        } 
        
        
        
    }
    
    
    
    
}
