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
public class Phonebook {
    
    private ArrayList<Person> persons=new ArrayList();
    
    
    public void add(String name, String number){
    
    
        Person person=new Person(name,number);
        
        persons.add(person);
        
        
    }
    
    
    public void printAll(){
    
    for(Person person:persons){
    
        System.out.println(person.toString());
    
    }
    
    }
    
    
    public String searchNumber(String name){
    
        
        String text="number not known";
    
         for(Person person:persons){
    
        if(person.getName().equals(name)){
        
        
        text=person.getNumber();
        }
        
       
        
    
    }
    
    return text;
    }
    
}
