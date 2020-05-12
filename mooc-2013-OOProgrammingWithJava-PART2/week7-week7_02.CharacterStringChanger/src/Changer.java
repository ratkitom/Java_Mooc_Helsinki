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

public class Changer {
    
    
    private ArrayList<Change> changesList=new ArrayList();
    
    public Changer(){}
    
    
    public void addChange(Change change){
    
    
    changesList.add(change);
    
    }
    
    public String change(String characterString) {
    String newText=characterString;
        
    for(Change change:changesList){
    
    newText=change.change(newText);
    
    }
        
    
    return newText;
    }
    
    
}
