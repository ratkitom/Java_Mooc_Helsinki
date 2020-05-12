/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author tomasz
 */

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class WordInspection {
    
    
    private  File f;
    private List<String> words;
    
    public WordInspection(File file) throws Exception{
    
        f=file;
        words=new ArrayList();
        makeList();
        
        
    }
    
    
    private void makeList() throws Exception{
    
    Scanner reader=new Scanner(f,"UTF-8");
        
        
        
        while(reader.hasNext()){
        
        
        String word= reader.next();
        
            words.add(word);
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
    
    }
    
    
    public int wordCount() {
    
      
            
        return words.size();
        
        
        
     }
    
    
    public List<String> wordsContainingZ() {
        
        
        List<String> words=new ArrayList();
        
     
        for(String word:this.words){
        
        
            if(word.contains("z")) words.add(word);
        
        }
        
        return words;
        
        
    
    
        
    
    }
    
    
    public List<String> wordsEndingInL() {
    
            
           List<String> words=new ArrayList();
           char lastchar;
           
           for(String word:this.words){
           
               lastchar=word.charAt(word.length()-1);
               
               if(lastchar=='l') words.add(word);
               
                   
           
           }
           
           return words;
            
        
    }
    
    public List<String> palindromes(){
    
        List<String> words=new ArrayList();  
        
        
        for(String word:this.words){
        
            String reversed="";
            
            for(int i=word.length()-1;i>=0;i--){
            
                reversed=reversed+word.charAt(i);
                
            
            }
            if(word.equals(reversed)) words.add(word);
        
        
        }
    
        
            return words;
    
    }
    
    
    public List<String> wordsWhichContainAllVowels(){
    
        List<String> words=new ArrayList();
        
        char[] vowels="aeiouyäö".toCharArray();
        
        boolean check=false;
      
        
        for(String word:this.words){
        
            
            for(int i=0;i<vowels.length;i++){
                
                check=false;
                
                for(int j=0;j<word.length();j++){
                
                
                        if(vowels[i]==word.charAt(j)){
                        
                            check=true;
                            break;
                            
                        } 
                
                }   
            
                if(check==false) break;
                    
            
            }
            
                if(check==true) words.add(word);
            
            
        
        }
        
                return words;
    
    }
    
}
