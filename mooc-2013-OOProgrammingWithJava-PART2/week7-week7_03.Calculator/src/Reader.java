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
public class Reader {
    
    
   private Scanner reader=new Scanner(System.in);
    
    
    public Reader(){}
    
    
    public String readString(){
    
        String operation=reader.nextLine();
        
        return operation;
    
    }
    
    
    public int readInteger(){
    
        int value=Integer.parseInt(reader.nextLine());
        
        
        
        return value;
        
         }
    
    
    
    
}
