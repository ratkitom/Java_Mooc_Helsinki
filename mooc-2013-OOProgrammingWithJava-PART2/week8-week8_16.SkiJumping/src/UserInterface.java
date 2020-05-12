/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UserInterface {
    
    
    private Scanner reader;
    private ArrayList<Jumper> jumpers;
    
    public UserInterface(Scanner reader){
    
    this.reader=reader;
    this.jumpers=new ArrayList<Jumper>();
    
    
    }
    
    
    
    public void start(){
    
        
        enterJumper();
        startTournament();
        
        
        
    
    }
    
    
        private void enterJumper(){
    
        System.out.println("Kumpula ski jumping week");
         System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true){
        System.out.print("  Participant name: ");
        String name=reader.nextLine();
        if(!name.equals("")){
            
            jumpers.add(new Jumper(name));
        
        }   else{
            
            System.out.println();
            break;
        
        
        }
        
        }
        
        
            System.out.println("The tournament begins!");
            System.out.println();
        
        
    }
    
        private void startTournament(){
    
            
            int roundCounter=0;
        
            while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command=reader.nextLine();
            System.out.println();
            
            if(command.equals("jump")){
            
                roundCounter++;
                System.out.println("Round "+roundCounter);
                printJumpOrder();
                playRound();
                System.out.println("Results of round "+roundCounter);
                printRoundResults();
                Collections.sort(jumpers);
            
            
            
            
            
            
            
            
            
            } else {
                
                
                
                    break;
            
            }
            
            
    }
            
                 tournamentResults();
    
    }
    
        private void printJumpOrder(){
            
            
            
            System.out.println();
            System.out.println("Jumping order:");
            
            int i=1;
        
        for(Jumper jumper:jumpers){
        
                System.out.println("  "+i+". "+jumper.getName()+" ("+jumper.getStats().getPoints()+" points)");
                 i++;
        }
        
        
            System.out.println();
        
        }
        
        private void printRoundResults(){
            
            int counter=0;
            JumperStats stats=null;
            
             for(Jumper jumper:jumpers){
                 
                 stats=jumper.getStats();
        
                 System.out.println("  "+jumper.getName());
                 System.out.println("    length: "+stats.getJumpLength());
                 System.out.print("    judge votes: [");
                 
                 for(int vote:stats.getJumpRates().getRates()){
                     
                     
                        if(!(counter==4)){
                             
                             System.out.print(vote+", ");
                         
                     }  else{
                        
                            System.out.print(vote+"]");
                        }
                 
                        counter++;
                 
                 }
                 
                 counter=0;
                 System.out.println();
                 
                   
        }
             System.out.println();
          
            
        
        
        }
        
        private void playRound(){
        
        for(Jumper jumper:jumpers){
        
            jumper.jump();
        
            
        }
        
        
        }
        
        private void tournamentResults(){
            
            
            System.out.println("Thanks!");
            System.out.println();
            System.out.println("Tournament results:");
            
            System.out.println("Position    Name");
            int counter1=0;
            int counter2=0;
            Collections.reverse(jumpers);
            
            for(Jumper jumper:jumpers){
            
                counter1++;
                System.out.println(counter1+"           "+jumper.getName()+" ("+jumper.getStats().getPoints()+")");
                System.out.print("            jump lengths: ");
                for(int jumps:jumper.getStats().getAllJumps()){
                        
                        if(!(counter2==jumper.getStats().getAllJumps().size()-1)){
                
                            System.out.print(jumps+" m, ");
                            
                        }   else{
                            
                            System.out.print(jumps+" m");
                        
                        }
                        
                        counter2++;
                }
                counter2=0;
                System.out.println();
            
            }
                
            
        
        }
        
       
    
}
