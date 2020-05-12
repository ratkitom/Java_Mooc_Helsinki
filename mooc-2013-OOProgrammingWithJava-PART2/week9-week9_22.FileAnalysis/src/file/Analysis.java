/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author tomasz
 */
import java.io.File;
import java.util.Scanner;
public class Analysis {
    
    private File f;
    private Scanner reader;
    
    public Analysis(File file){
    
        f=file;
    
    }
    
    
    public int lines() throws Exception{
    
        reader=new Scanner(f);
        int lines=0;
        
        while(reader.hasNextLine()){
        
            reader.nextLine();
            lines++;
        
        
        }
        
        
        return lines;
    
    
    }
    
    
    public int characters() throws Exception{
    
    reader=new Scanner(f);
    int characters=0;
    
     while(reader.hasNextLine()){
        
           String line=reader.nextLine();
           characters=characters+line.length()+1;
           
           
           
        
        
        }
     
     return characters;
        
    
    }
    
    
}
