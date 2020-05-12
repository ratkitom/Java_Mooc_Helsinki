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
import java.util.Map;
public class PromissoryNote {
    
    
  private  HashMap<String,Double> persons;
    
    
    public PromissoryNote(){
    
    persons=new HashMap<String,Double>();
        
        
    
    }
    
    
     public void setLoan(String toWhom, double value){
     
     persons.put(toWhom, value);
     
     
     }
     
     
     public double howMuchIsTheDebt(String whose) {
     
     Double debt=persons.get(whose);
     if(debt==null){
     
         return 0;
     
     }
     else{
     
     return debt;
     
     }
     
    
     }
     
    
}
