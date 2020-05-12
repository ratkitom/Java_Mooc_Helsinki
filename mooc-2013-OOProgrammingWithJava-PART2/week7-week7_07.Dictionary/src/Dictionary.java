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
public class Dictionary {
    
    
    private HashMap<String,String> words=new HashMap<String,String>();
    
    
    public Dictionary(){}
    
    
    public String translate(String word){
    
        String translate=words.get(word);
        
   
        
        return translate;
    
    }
    
    
    public void add(String word, String translation){
    
        words.put(word, translation);
        
    
    }
    
    public int amountOfWords(){
    
    return words.size();
    
    }
    
    public ArrayList<String> translationList(){
    
    ArrayList<String> translations=new ArrayList();
        
    for(String key:words.keySet()){
    
    String translation=key+" = "+words.get(key);
    translations.add(translation);
    
    }
    
    
    return translations;
    
    }
    
}
