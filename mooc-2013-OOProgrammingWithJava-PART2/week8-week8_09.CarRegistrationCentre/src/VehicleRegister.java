/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegister {
    
   private HashMap<RegistrationPlate, String> owners=new HashMap<RegistrationPlate,String>();
   
    public boolean add(RegistrationPlate plate, String owner){
    
    
        if(owners.get(plate)==null){
        
        
        owners.put(plate, owner);
        return true;
        
        }
        
       
        
        return false;
        
    
    
    
    }
    
    
    
    public String get(RegistrationPlate plate){
    
    return owners.get(plate);
    
    
    }
    
    
    public boolean delete(RegistrationPlate plate){
    
    
    if(owners.get(plate)==null){
    
    return false;
    }
    
    owners.put(plate,null);
    return true;
    
    }
    
    public void printRegistrationPlates(){
    
    for(RegistrationPlate plate:owners.keySet()){
    
        System.out.println(plate);
    
    }
    
    
    
    }
    
    
    public void printOwners(){
    
        ArrayList<String> temp=new ArrayList();
        
        
        
        for(RegistrationPlate plate:owners.keySet()){
    
        if(!(temp.contains(owners.get(plate)))){
        
        temp.add(owners.get(plate));
            System.out.println(owners.get(plate));
        
        }
    
    }
        
        
    
    
    }
    
}
