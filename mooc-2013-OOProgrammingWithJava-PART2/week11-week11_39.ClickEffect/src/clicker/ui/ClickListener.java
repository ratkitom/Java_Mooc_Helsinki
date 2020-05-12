/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;
import clicker.applicationlogic.Calculator;
import  java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author tomasz
 */
public class ClickListener implements ActionListener {
    
   private Calculator counter;
   private JLabel label;
    
    public ClickListener(Calculator counter,JLabel label){
        
        this.counter=counter;
        this.label=label;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        counter.increase();
        label.setText(Integer.toString(counter.giveValue()));
        
        
        
    }
    
    
    
}
