/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card t, Card t1) {
        
        int result=t.getSuit()-t1.getSuit();
        
        if(result==0){
        
        result=t.getValue()-t1.getValue();
        
        
        }
        
        return result;
        
    }

  
    
    
    
}
