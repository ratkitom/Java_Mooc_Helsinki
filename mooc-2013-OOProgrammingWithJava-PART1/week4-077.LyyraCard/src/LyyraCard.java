/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class LyyraCard {
    
    private double balance;
    
    
     public LyyraCard(double balanceAtStart) {
        // write code here
        
        this.balance=balanceAtStart;
    }

     
     public String toString(){
     
      String text="The card has "+balance+" euros";
     
      return text;
     }
     
     
     public void payEconomical() {
         
    // write code here
    if(balance>=2.50)
   balance=balance-2.50;
}

public void payGourmet() {
    // write code here
    if(balance>=4.00)
    balance=balance-4.00;
}

public void loadMoney(double amount) {
    // write code here
    if(amount>0){
    if(balance+amount>=150)
            balance=150;
    else balance=balance+amount;
    }
    
}
     
    
}
