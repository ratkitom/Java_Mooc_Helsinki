/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class ButtonsListener implements ActionListener {

   private JButton button;
   private JButton zbutton;
   private JTextField input;
   private JTextField output;
    
   public ButtonsListener(JButton button,JButton zbutton,JTextField input,JTextField output){
   
       this.zbutton=zbutton;
       this.button=button;
       this.input=input;
       this.output=output;
       
       
   
   }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int inputValue;
        
        try{
        
            inputValue=Integer.parseInt(input.getText());
            
           if(button.getText().equals("+")){
           
             output.setText(addValue(inputValue)); 
               
           
               } else if(button.getText().equals("-")){
               
               
                   output.setText(subtractValue(inputValue));
                   
                   
               
               
               } else {
               
                  output.setText(resetOutput());
               }
        
        
               input.setText("");
        
        }catch (Exception e){
            
            if(button.getText().equals("Z")) output.setText(resetOutput());
        
            input.setText("");
        
        }
        
        
        
        
        
     
        
        
    
    
    }
    
    
    private String addValue(int value){
    
    
        int newValue=value+Integer.parseInt(output.getText());
        
        if(newValue==0) zbutton.setEnabled(false);
        else zbutton.setEnabled(true);
        
        return Integer.toString(newValue);
        
    
    }
    
    private String subtractValue(int value){
    
     int newValue=Integer.parseInt(output.getText())-value;
     
     if(newValue==0) zbutton.setEnabled(false);
     else zbutton.setEnabled(true);
        
      return Integer.toString(newValue);
        
    }
    
    private String resetOutput(){
        
        
    zbutton.setEnabled(false);
    return "0";
    }
    
}
