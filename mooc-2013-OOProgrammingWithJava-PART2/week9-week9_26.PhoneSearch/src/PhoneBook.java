/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;

public class PhoneBook {
    
    
    private Map<String,PersonInformation> phonebook;
    
    PhoneBook(){
    
        this.phonebook=new HashMap<String,PersonInformation>();
            
        
    
    }
    
    public void addNumber(String whoseNumber,String number){
        
        if(!this.phonebook.containsKey(whoseNumber)){
        
            PersonInformation pi=new PersonInformation();
            
            
            this.phonebook.put(whoseNumber, pi);
            
            
        
        }   
        
        this.phonebook.get(whoseNumber).addPhoneNumber(number);
        
        
        
    
    }
    
    public void addAddress(String whoseAddress,String street,String city){
    
        
            if(!this.phonebook.containsKey(whoseAddress)){
        
            PersonInformation pi=new PersonInformation();
            
            
            this.phonebook.put(whoseAddress, pi);
            
            
        
        }   
        
        this.phonebook.get(whoseAddress).addAddress(street, city);
        
        
    
    }
    
    public Set<String> searchForNumber(String whoseNumber){
            
        
        
        if(!this.phonebook.containsKey(whoseNumber)){
        
            return null;
        
        }
        PersonInformation pi=this.phonebook.get(whoseNumber);
        
        Set<String> numbers=pi.getPhoneNumbers();
        
        return numbers;
        
        
    }
    
    public String searchForPerson(String number){
        
        
        
        PersonInformation pi; 
        
          for(String name:this.phonebook.keySet()) {
          
              pi=this.phonebook.get(name);
              
              if(pi.getPhoneNumbers().contains(number)){
              
                  return name;
              }
              
              
          
          }
          
          return null;
        
    
    }
    
    
    public PersonInformation searchForPersonalInfo(String whoseInfo){
        
        
        if(!this.phonebook.containsKey(whoseInfo)){
        
            return null;
            
            
        }
        
          PersonInformation pi=this.phonebook.get(whoseInfo);
          
          return pi;
    
        
    
    }
    
    public void removePerson(String name){
    
    
    if(this.phonebook.containsKey(name)){
    
        this.phonebook.remove(name);
    
    }
    
    
    }
    
    public Map<String,PersonInformation> filtredList(String keyWord){
    
        if(keyWord.isEmpty()){
        
            return this.phonebook;
        }
        
        Map<String,PersonInformation> filtredList=new HashMap<String,PersonInformation>();
        
        PersonInformation pi;
        Set<Address> addresses;
        
        for(String name:this.phonebook.keySet()){
        
                
                
                if(name.contains(keyWord)){
                    pi=this.phonebook.get(name);
                    filtredList.put(name, pi);
                
                } else{
                
                
                    pi=this.phonebook.get(name);
                    addresses=pi.getAdresses();
                    
                   
                    for(Address address:addresses){
                    
                        if(address.getStreet().contains(keyWord)||address.getCity().contains(keyWord)){
                        
                        filtredList.put(name, pi);
                        
                        }
                    
                    }
                    
                
                }
                
        }
                Map<String,PersonInformation> sorted=new TreeMap(filtredList);
               
        
                return sorted;
        
    
    }
   
    
    
    
    
    
    
    
}
