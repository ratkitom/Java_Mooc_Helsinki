/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class Purchase {
    
    
    private String product;
    private int amount;
    private int unitPrice;
    
    
    public Purchase(String product, int amount, int unitPrice){
    
        this.product=product;
        this.amount=amount;
        this.unitPrice=unitPrice;
        
        
    }
    
    
    
    public int price(){
    
        int price=amount*unitPrice;
        
        return price;
        
    }
    
    public void increaseAmount(){
    
        amount++;
        
    }
    
    
    public String toString(){
    
    
        String print=product+": "+amount;
        
        return print;
        
    }
    
    public String product(){
    
    return this.product;
    }
    
    
}
