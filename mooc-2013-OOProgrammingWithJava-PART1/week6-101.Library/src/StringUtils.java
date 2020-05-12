/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class StringUtils {
    
    
    public static boolean included(String word, String searched){
    
    word=word.trim();
    word=word.toLowerCase();
    
    searched=searched.trim();
    searched=searched.toLowerCase();
    
    
    if(word.contains(searched))
        return true;
    else{
    return false;
    }
    
    
    
    }
    
    
    
}
