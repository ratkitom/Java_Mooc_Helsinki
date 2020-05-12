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

public class IOhandler {
    
    Scanner scanner=new Scanner(System.in);
    String command;
    public IOhandler(){}
    
   
    
    public void executeCommands(){
        
        
        while(true){
       
            System.out.print("? ");
       command=scanner.nextLine(); 
    
    if(this.command.equalsIgnoreCase("Add")){
        
        System.out.print("Name: ");
        String name=scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName=scanner.nextLine();
        
        Bird bird=new Bird(name,latinName);
    
    }
    
     if(this.command.equalsIgnoreCase("Observation")){
    
         System.out.print("What was observed:? ");
         String name=scanner.nextLine();
         Bird.addObservation(name);
         
    
    }
     
     if(this.command.equalsIgnoreCase("Statistics")){
    
        Bird.printAllBirds();
         
    
    }
     
      if(this.command.equalsIgnoreCase("Show")){
    
         System.out.print("What? ");
         String name=scanner.nextLine();
         Bird.serachBird(name);
         
    
    }
      
      
     if(this.command.equalsIgnoreCase("Quit")){
     
         break;
         
     }
     
     else{
     
         System.out.println("No such command");
     }
     
     
     
    
        }
    
    }
    
    
    
    
}
