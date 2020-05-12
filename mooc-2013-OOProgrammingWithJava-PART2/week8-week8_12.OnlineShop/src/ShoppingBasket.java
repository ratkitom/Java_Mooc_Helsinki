/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.List;
import java.util.ArrayList;
public class ShoppingBasket {
    
    
    private List<Purchase> basket;
    
    public ShoppingBasket(){
    
        
        basket=new ArrayList<Purchase>();
    
    
    }
    
    
    public void add(String product, int price){
        
    for(Purchase purchased:this.basket){
        
        if(purchased.product().equals(product)){
        
        purchased.increaseAmount();
        
        return;
        }
    
    
    }    
    
    basket.add(new Purchase(product,1,price));
        
    }
    
    
    public int price(){
    
    int price=0;
    
    for(Purchase purchased:this.basket){
    
    price=price+purchased.price();
    
    }
    
    return price;
    
    
    }
    
    public void print(){
    
       for(Purchase product:this.basket){
    
           System.out.println(product);
    
    }
       
       
    
    
    }
    
    
    
    
    
}
