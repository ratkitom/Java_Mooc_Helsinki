/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import java.io.File;
import java.util.Scanner;

public class Printer {
    
    private File f;
    private Scanner reader;
    
    
    
     public Printer(String fileName) throws Exception{
     
         f=new File(fileName);
         
         
         
     
     }
     
     public void printLinesWhichContain(String word) throws Exception{
     
         
         reader=new Scanner(f,"UTF-8");
         
         while(reader.hasNextLine()){
         
             String line=reader.nextLine();
             
             if(line.contains(word)){
             
                 
                 System.out.println(line);
                 
                 
                 
                 
             }
         
         
         
         
         }
        
         
        
     
     }
    
}
