/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    
    
    private ArrayList<Card> cards;
    
    public Hand(){
    
    cards=new ArrayList<Card>();
    
    
    }
    
    public void add(Card card){
    
        cards.add(card);
        
    
    }
    
    public void print(){
    
        for(Card card:cards){
        
            System.out.println(Card.VALUES[card.getValue()]+" of "+Card.SUITS[card.getSuit()]);        
        }
    
    }
    
    
    public void sort(){
    
        Collections.sort(cards);
    
    }

    @Override
    public int compareTo(Hand t) {
        
        int result=this.sum()-t.sum();
        
        return result;
        
        
    }
    
    
    private int sum(){
    
        int sum=0;
        
    for(Card card:cards){
    
        sum=sum+card.getValue();
    
    
    }
    
         return sum;
    
    }
    
    
    public void sortAgainstSuit(){
        
        
        SortAgainstSuitAndValue sort=new SortAgainstSuitAndValue();
        
        
        Collections.sort(cards, sort);
    
        
    
    }
    
    
    
    
    
    
    
}
