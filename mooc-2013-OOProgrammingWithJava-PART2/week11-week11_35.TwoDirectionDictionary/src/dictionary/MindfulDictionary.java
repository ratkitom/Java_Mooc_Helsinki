/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author tomasz
 */

import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;


public class MindfulDictionary {
    
    private Scanner reader;
    private String fileName;
    private HashMap<String,String> words;
    
    public MindfulDictionary(){
    
    words=new HashMap();
    
    }
    
    public MindfulDictionary(String file){
        
        words=new HashMap();
        fileName=file;
        
    
    }
    
    public boolean load() {
    
        try{
        
        reader=new Scanner(new File(fileName));
  
        } catch(Exception e){
        
            
            return false;
        }
        
        
            while(reader.hasNextLine()){
        
            String line=reader.nextLine();
            
            String[] words=line.split(":");
                
            
            this.words.put(words[0], words[1]);
            
            
        
        }
            reader.close();
        
            return true;
    }
    
    
    
    public void add(String word, String translation){
    
        if(!words.containsKey(word)){
        
        words.put(word, translation);
        
        }
        
    }
    
    public String translate(String word){
    
        if(words.containsKey(word)){
        
            return words.get(word);
        } else if(words.containsValue(word)){
        
           
            
            for(String translation:words.keySet()){
            
                if(words.get(translation).equals(word)){
                    return translation;
                }
                
            }
        } 
        return null;
    
    }
    
    public void remove(String word){
        
          if(words.containsKey(word)){
        
            words.remove(word);
        }   else if(words.containsValue(word)){
            
                String forRemove="";
                
                 for(String translation:words.keySet()){
            
                if(words.get(translation).equals(word)){
                    
                    forRemove=translation;
                }
                
            }
                 words.remove(forRemove);
        
        }
        
    
    }
    
    public boolean save(){
    
        try{
        
            FileWriter writer=new FileWriter(fileName);
            
              for(String key:words.keySet()){
            
                String line=key+":"+words.get(key);
                writer.write(line+"\n");
                
            
            }
            
            writer.close();
        
        }catch(Exception e){
        
            return false;
        }
            return true;
          
    }
    
}


