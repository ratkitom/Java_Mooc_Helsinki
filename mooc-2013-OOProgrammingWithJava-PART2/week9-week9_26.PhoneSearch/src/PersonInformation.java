/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Set;
import java.util.HashSet;

public class PersonInformation {
    
    
    private Set<Address> addresses;
    private Set<String> phoneNumbers;
    
    public PersonInformation(){
    
        addresses=new HashSet<Address>();
        phoneNumbers=new HashSet<String>();
    }
    
    public void addPhoneNumber(String number){
            
        phoneNumbers.add(number);
    
    }
    
    public void addAddress(String street,String city){
    
        Address address=new Address();
        
        address.setStreet(street);
        address.setCity(city);
        
        this.addresses.add(address);
        
        
    }
    
    public Set<String> getPhoneNumbers(){
    
        return this.phoneNumbers;
    }
    
     public Set<Address> getAdresses(){
    
        return this.addresses;
    }
    
    
    
}
