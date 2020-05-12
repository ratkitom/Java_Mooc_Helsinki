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
import java.util.Set;
import java.util.Map;
import java.util.Collections;

public class UserInterface {


    private Scanner reader;
    private PhoneBook phonebook;
    
    public UserInterface(Scanner reader){
    
        this.phonebook=new PhoneBook();
        this.reader=reader;
    
    }
    
    
    private void description(){
    
        
        System.out.println("  phone search");
        System.out.println("  available operations:");
        System.out.println("   1 add a number");
        System.out.println("   2 search for a number");
        System.out.println("   3 search for a person by phone number");
        System.out.println("   4 add an address");
        System.out.println("   5 search for personal information");
        System.out.println("   6 delete personal information");
        System.out.println("   7 filtered listing");
        System.out.println("   x quit");
        System.out.println("");
        
        
        
        
    }
    
    public void start(){
    description();
    executeCommands();
    }
    
    private void executeCommands(){
        
        
        String command;
        
        do{
        
            System.out.print("  command: ");
            command=reader.nextLine();
            
            
            if(command.equals("1")){
            
                addNumber();
                
            }   else if(command.equals("2")){
            
                searchForNumber();
            
            }   else if(command.equals("3")){
            
                searchForPerson();
            
            }   else if(command.equals("4")){
            
                addAddress();
                
            }   else if(command.equals("5")){
            
                searchForPersonInformation();
            
            }   else if(command.equals("6")){
            
                removePerson();
            
            
            }   else if(command.equals("7")){
            
                filtredSearch();
            
            }   
        
        
        
        
        
        
        
        
        
        
        
        
        
        }while(!command.equals("x"));
    
    
    
    }
    
    
    private void addNumber(){
        
        System.out.print("  whose number: ");
        String name=reader.nextLine();
        System.out.print("  number: ");
        String number=reader.nextLine();
        
        this.phonebook.addNumber(name, number);

        System.out.println("");
          
    
    }
    
    private void searchForNumber(){
    
        System.out.print("  whose number: ");
        String name=reader.nextLine();
        
       Set<String> numbers=this.phonebook.searchForNumber(name);
       
       if(numbers==null||numbers.isEmpty()){
       
           System.out.println("    not found");
       } else{
       
           for(String number:numbers){
           System.out.println("   "+number);
           
           }
       }
       
        System.out.println("");
    }
    
    private void searchForPerson(){
    
        System.out.print("  number: ");
        String number=reader.nextLine();
        
        
        String name=this.phonebook.searchForPerson(number);
        
        if(name==null){
        
            System.out.println("   not found");
        } else{
        
        System.out.println("   "+name);
        }
        System.out.println("");
    
    }
    
    private void addAddress(){
        
        System.out.print("  whose address: ");
        String name=reader.nextLine();
        System.out.print("  street: ");
        String street=reader.nextLine();
        System.out.print("  city: ");
        String city=reader.nextLine();
        
        this.phonebook.addAddress(name, street, city);
        
        
        
        System.out.println("");
        
    
    }
    
    private void searchForPersonInformation(){
    
        System.out.print("  whose information: ");
        String name=reader.nextLine();
        
        PersonInformation pi=this.phonebook.searchForPersonalInfo(name);
        
        
        if(pi==null){
        
            System.out.println("    not found");
            return;
        }
        
        Set<Address> addresses=pi.getAdresses();
        Set<String> numbers=pi.getPhoneNumbers();
        
        if(addresses.isEmpty()){
            System.out.print("    address unknown");
        }   else{
        
        
            
            for(Address address:addresses){
                
                System.out.print("    address: ");
                System.out.println(address.getStreet()+" "+address.getCity());
                
                
            }
            
            
        }
        if(numbers.isEmpty()){
        
            System.out.println("    phone number not found");
            
        }   else {
        
            System.out.println("    phone numbers:");
        
            for(String number:numbers){
            
                System.out.println("     "+number);
            
            }
        
        }
        
        
            System.out.println("");
    
    }
    
    private void removePerson(){
    
        System.out.print("  whose information: ");
        String name=reader.nextLine();
        
        this.phonebook.removePerson(name);
        System.out.println("");
    
    }
    
    private void filtredSearch(){
    
        System.out.print("  keyword (if empty, all listed): ");
        String keyword=reader.nextLine();
        System.out.println("");
        
        Map<String,PersonInformation> list=this.phonebook.filtredList(keyword);
        
        if(list.isEmpty()){
            
            System.out.println("   keyword not found");
            return;
        }   else{
        
            for(String name:list.keySet()){
            
                
                Set<Address> addresses=this.phonebook.searchForPersonalInfo(name).getAdresses();
                Set<String>  numbers=this.phonebook.searchForPersonalInfo(name).getPhoneNumbers();
                
                System.out.println("   "+name);
                if(addresses.isEmpty()){
                    System.out.println("    address unknown");
                }   else{
                
                    for(Address address:addresses){
                    
                        System.out.println("    address: "+address.getStreet()+" "+address.getCity());
                    }
                
                }
                if(numbers.isEmpty()){
                    System.out.println("    phone number not found");
                }   else{
                
                    System.out.println("    phone numbers");
                    for(String number:numbers)
                    System.out.println("     "+number);
                }
                
                
                System.out.println("");
            
            }
        
        
        }
        
        
    
    }
    
    
    
    
    
}
