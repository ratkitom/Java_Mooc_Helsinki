import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class Team {
    
   private String name;
   private ArrayList<Player> players=new ArrayList();
   
   private int maxSize=16;
   
   public Team(String name){
   
   this.name=name;
   }
   
   public String getName(){
   
   return name;
   
   }
   
  public void addPlayer (Player player){
      
      if(players.size()<maxSize)
      players.add(player);
      
  
  }
  
  
  public void printPlayers(){
  
  for(Player var:players){
      
      System.out.println(var.toString());  
  }
  
  }
  
  public void setMaxSize(int maxSize){
      
      this.maxSize=maxSize;
      
  }
  
  public int size(){
   
      return players.size();
  }
  
  public int goals(){
  
  
      int goals=0;
      
      for(Player var:players){
      
      goals=goals+var.goals();
          
      }
  
      
      return goals;
  
  }
   
   
   
}
