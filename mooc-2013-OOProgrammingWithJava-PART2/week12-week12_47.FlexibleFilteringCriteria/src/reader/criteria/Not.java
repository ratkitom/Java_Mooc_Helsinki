/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author tomasz
 */
public class Not implements Criterion {
    
    private Criterion condition;
    public Not(Criterion condition){
    
    this.condition=condition;
    
    }

    @Override
    public boolean complies(String line) {
        
        if(!condition.complies(line)){
        return true;
        }
        return false;
    }
    
}
