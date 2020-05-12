/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *
 * @author tomasz
 */
public class Dungeon {
   
   private Random rand;
   private Player player;
   private List<Cordinates> vampires;
   private int length;
   private int height;
   private int playerMoves;
   private int vampiresAmount;
   private boolean vampiresMove;
   private Scanner reader; 
   
     public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
         
         if(length*height<=vampires){
         
             throw new IllegalArgumentException("Dungeon is to small for such amount of vampires");
         
         }
         this.vampires=new ArrayList();
         this.length=length;
         this.height=height;
         player=new Player();
         vampiresAmount=vampires;
         playerMoves=moves;
         this.vampiresMove=vampiresMove;
         rand=new Random();
         reader=new Scanner(System.in);
         
     }
     
     public void run(){
         
         
         
    initializeVampires(vampiresAmount);
     
   
   
    while(playerMoves>0 && !vampires.isEmpty()){
        
    System.out.println(playerMoves);
    
        
    printCordinates();
     
    printDungeon();
     
    
      
     
    String moves=reader.nextLine();
    
    playerMoves=playerMoves-1;
    
    for(int i=0;i<moves.length();i++){
        
        
    
            movePlayer(moves.charAt(i));
            if(vampiresMove){
            moveVampires();
            
            }
           
    }
    
     
     
     }
    
    if(playerMoves==0 && !vampires.isEmpty()){
    
        System.out.println("YOU LOSE");
    
    } else if(vampires.isEmpty()){
    
        System.out.println("YOU WIN");
    
    }
     
     
     }
     
     
     private void initializeVampires(int howMany){
         
           
             
             int x=rand.nextInt(length);
             int y=rand.nextInt(height);
             int i=0;
             
            while(i<howMany) 
             if(compareCordinates(x,y)==null){
             
             vampires.add(new Vampire(x,y));
             i++;
             } else{
             
             x=rand.nextInt(length);
             y=rand.nextInt(height);
             
             
             }
            
         
         
         
     }
     
     private void printCordinates(){
         System.out.println("");
         System.out.println(player.getSign()+" "+player.getX()+" "+player.getY());
         
         for(Cordinates vampire:vampires){
         
             System.out.println(vampire.getSign()+" "+vampire.getX()+" "+vampire.getY());
             
         
         }
         System.out.println("");
         
         
         
         
     
     
     }
     
     private void printDungeon(){
     
         for(int i=0;i<height;i++){
             
             
         
             for(int j=0;j<length;j++){
             
                 Cordinates object=compareCordinates(j,i);
                 
                 if(object==null){
                 System.out.print(".");
                 }
                 else{
                 
                     System.out.print(object.getSign());
                 
                 }
                 
             
             }
             System.out.println("");
         
         
         
         
         }
         System.out.println("");
     
     
     
     
     }
     
     
     private Cordinates compareCordinates(int x, int y){
     
         if(player.getX()==x && player.getY()==y){
         
             return player;
         
         }
         
         for(Cordinates vampire:vampires){
         
         if(vampire.getX()==x && vampire.getY()==y){
         
             return vampire;
             
         }
         
         }
         
         return null;
         
     
         
     
     }
     
   
     
     
     private void movePlayer(char move){
         
         List<Cordinates> destroyed=new ArrayList();
         
         Cordinates vampire=null;
         
         switch(move){
             case 'a':
                 if(player.getX()-1>=0){
                     
                 vampire=compareCordinates(player.getX()-1,player.getY());
                 
                 if(vampire==null)  player.moveLeft();
                 
                 else {
                 player.moveLeft();
                 destroyed.add(vampire);
                  
                 }
                 
                 }
                 break;
                 
             case 'd':
                 if(player.getX()+1<length){
                 
                vampire=compareCordinates(player.getX()+1,player.getY());
                
               if(vampire==null) player.moveRight();
               
               else{
               player.moveRight();
               destroyed.add(vampire);
               } 
                
                 
                 }
                 break;
             
             case 's':
                 if(player.getY()+1<height){
                     
                 
                     vampire=compareCordinates(player.getX(),player.getY()+1);
                     
                     if(vampire==null) {
                         
                         player.moveDown();
                        
                     }
                     else{
                        
                        destroyed.add(vampire);
                        player.moveDown();
                     
                     }
                     
                 }
                 break;
             
             case 'w':
                 if(player.getY()-1>=0){
                    
                  vampire=compareCordinates(player.getX(),player.getY()-1);   
                     
                 if(vampire==null) player.moveUp();
                  
                 else{
                     player.moveUp();
                     destroyed.add(vampire);
                     
                 
                 }
                  
                 }
                 break;
            
             
         
         }
         
       
         vampires.removeAll(destroyed);
         
     
     
     }
     
     private void moveVampires(){
         
         int move=0;
         List<Cordinates> destroyed=new ArrayList();
         
         for(Cordinates vampire:vampires){
         
             move=rand.nextInt(4);
             
             
             switch(move){
             
                 case 0:
                     if(compareCordinates(vampire.getX()-1,vampire.getY())==null && vampire.getX()-1>=0)
                     vampire.moveLeft();
                     else if(compareCordinates(vampire.getX()-1,vampire.getY())==player){
                            destroyed.add(vampire);
                     }
                     break;
                     
                 case 1: 
                     if(compareCordinates(vampire.getX()+1,vampire.getY())==null && vampire.getX()+1<length)
                     vampire.moveRight();
                     
                     else if(compareCordinates(vampire.getX()+1,vampire.getY())==player){
                            destroyed.add(vampire);
                     
                     }
                     break;
                     
                 case 2: 
                     if(compareCordinates(vampire.getX(),vampire.getY()-1)==null && vampire.getY()-1>=0)
                     vampire.moveUp();
                     
                     else if(compareCordinates(vampire.getX(),vampire.getY()-1)==player){
                     
                            destroyed.add(vampire);
                     }
                     break;
                     
                 case 3: 
                     if(compareCordinates(vampire.getX(),vampire.getY()+1)==null && vampire.getY()+1<height)
                     vampire.moveDown();
                     
                     else if(compareCordinates(vampire.getX(),vampire.getY()+1)==player){
                     
                            destroyed.add(vampire);
                     }
                     break;
             
             }
         
         
         
         }
         
            vampires.removeAll(destroyed);
         
     
     
     }
     
     
     
     
    
}

