/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author tomasz
 */

import mooc.ui.UserInterface;
public class ApplicationLogic {
    
   private UserInterface ui;
    public ApplicationLogic(UserInterface ui){
    
    this.ui=ui;
    
    }
    
    
    public void execute(int howManyTimes){
    
    
    for(int i=0;i<howManyTimes;i++){
    
        System.out.println("The application logic work");
        ui.update();
    
    }
    
    
    
    }
}
