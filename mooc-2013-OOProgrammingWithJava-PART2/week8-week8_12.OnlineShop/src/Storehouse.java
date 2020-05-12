/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    
    
    private Map<String,Integer> products;
    private Map<String,Integer> productStock;
    
    public Storehouse(){
    
    this.products=new HashMap<String,Integer>();
    this.productStock=new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        
        products.put(product, price);
        productStock.put(product, stock);
        
        
    
    }
    
    public int price(String product){
        
        
        Integer productPrice=this.products.get(product);
        if(productPrice==null) return -99;
        
        return productPrice;
    }
    
    public int stock(String product){
    
        Integer stock=this.productStock.get(product);
        
        if(stock==null) return 0;
        
         return stock;
    }
    
    public boolean take(String product){
    
    Integer stock=stock(product);
    
    
        
        if(stock>0){
         stock--;
         this.productStock.put(product, stock);
         return true;
    }
        
    
    return false;
    
    
   }
    
    
    public Set<String> products(){
    
        
        Set<String> productsNames=this.products.keySet();
        
        return productsNames;
        
    
    
    }
    
}
