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

public class TextUserInterface {
    
   private Dictionary dictionary;
   private Scanner reader;
    
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
    
    this.reader=reader;
    this.dictionary=dictionary;
    
    
    
    }
    
    
    public void start(){
    
      
        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        
        
        String command;
        String finnish;
        String translation;
        
        while(true){
            
            System.out.print("Statement:");
            
            
            command=reader.nextLine();
            
            if(command.equals("add")){
            
                System.out.print("In Finnish: ");
                finnish=reader.nextLine();
                System.out.print("Translation: ");
                translation=reader.nextLine();
                
                dictionary.add(finnish, translation);
                
             }  else if(command.equals("translate")){
            
                System.out.print("Give a word: ");
                finnish=reader.nextLine();
                translation=dictionary.translate(finnish);
                System.out.print("Translation: "+translation);
                System.out.println("");
                
            
            }   else if(command.equals("quit")){
            
                System.out.println("Cheers!");
                break;
            }   else{
            
            
                System.out.println("Unknown statement");
            
            
            }
            
        
        
       }
        
    
    }
    
}   
