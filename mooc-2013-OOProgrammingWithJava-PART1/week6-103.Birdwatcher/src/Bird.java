/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.ArrayList;
public class Bird {
    
    private String name;
    private String latinName;
    private int observations=0;
    
    private static ArrayList<Bird> birds=new ArrayList();
    
    
    public Bird(String name,String latinName){
    
    this.name=name;
    this.latinName=latinName;
    
    birds.add(this);
    
    }
    
    
   
    
   
    
    public static void addObservation(String name){
    
        boolean check=false;
        
    for(Bird bird:birds){
    
        if(bird.name.equalsIgnoreCase(name)){
        
           bird.observations++;
           check=true;
        }
            
    
    
    }

         if(check==false){
        
            System.out.println("Is not a bird!");
        }    
        
    
    
    }
    
    public static void printAllBirds(){
    
    
    for(Bird bird:birds){
    
        System.out.println(bird.name+" ("+bird.latinName+"): "+bird.observations+" observations");
    
    }
    
    }
    
    public static void serachBird(String name){
        
         boolean check=false;
        
        for(Bird bird:birds){
        
            if(bird.name.equalsIgnoreCase(name)){
            
               System.out.println(bird.name+" ("+bird.latinName+"): "+bird.observations+" observations");
               check=true;
            }
        
        
        }
        
        if(check==false){
        
            System.out.println("Is not a bird!");
        }
        
    
    }
    
   
    
}
