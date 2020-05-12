/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.List;

/**
 *
 * @author tomasz
 */
public class AtLeastOne implements Criterion {
    
    private Criterion[] conditons; 
    
    public AtLeastOne(Criterion... criteria){
    
    this.conditons=criteria;
    
    }

    @Override
    public boolean complies(String line) {
        
        for(Criterion conditon:conditons){
        
        if(conditon.complies(line)){
        return true;
        }
        
        }
        
        return false;
    }
    
}
