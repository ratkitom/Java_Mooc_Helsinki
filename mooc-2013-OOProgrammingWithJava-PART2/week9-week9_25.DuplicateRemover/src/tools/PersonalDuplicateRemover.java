/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author tomasz
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private int duplicate;
    private Set<String> strings;
    
    
    public PersonalDuplicateRemover(){
    
        this.duplicate=0;
        this.strings=new HashSet<String>();
    
    }
    
    
    
    
    
    
    
    
    @Override
    public void add(String characterString) {
        
        if(!this.strings.add(characterString)) duplicate++;
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        
        return this.duplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        
        return this.strings;
    }

    @Override
    public void empty() {
        
        this.strings.clear();
        this.duplicate=0;
    }
    
}
