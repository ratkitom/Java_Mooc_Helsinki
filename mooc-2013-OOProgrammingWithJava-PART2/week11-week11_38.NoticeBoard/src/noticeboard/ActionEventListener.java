/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author tomasz
 */
public class ActionEventListener implements ActionListener {
    
    JTextField field;
    JLabel label;
    
    public ActionEventListener(JTextField field,JLabel label){
        
        this.field=field;
        this.label=label;
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       this.label.setText(this.field.getText());
       this.field.setText("");
        
    }
    
    
    
}
