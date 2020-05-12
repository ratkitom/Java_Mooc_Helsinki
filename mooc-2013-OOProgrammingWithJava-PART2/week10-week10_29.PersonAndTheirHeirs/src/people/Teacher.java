/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author tomasz
 */
public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name,String street,int salary){
    
        super(name,street);
        this.salary=salary;
        
        
    
    }
    
    public String toString(){
    
        String tekst=super.toString()+"\n  salary "+salary+" euros/month";
        
        return tekst;
    }
    
}
