/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.domain.*;

/**
 *
 * @author tomasz
 */
public class Reference {
    
    private RatingRegister register;
    
    public Reference(RatingRegister register){
    
    
    this.register=register;
   
        
    
    }
    
    public Film recommendFilm(Person person){
       
        System.out.println(person);
        
       if(register.getPersonalRatings(person).isEmpty()){
       
           System.out.println(person);
       
        Map<Film,List<Rating>> filmRatings=register.filmRatings();
        FilmComparator comparator=new FilmComparator(filmRatings);
        List<Film> films=new ArrayList();
        Set<Film> set=filmRatings.keySet();
        
        for(Film film:set){
        
        films.add(film);
        
        }
        
           
        
        Collections.sort(films, comparator);
        
           System.out.println(films);
        return films.get(0);
        
       }
       
       return recomendedFilm(person,commonFilms(person));
       
       
        
       }
    
    
    private Map<Person,Map<Film,Rating>> commonFilms(Person person){
    
        
        
        List<Person> reviewers=register.reviewers();
        reviewers.remove(person);
        List<Film> personFilms=new ArrayList<Film>(register.getPersonalRatings(person).keySet());
        
        
        
        Map<Person,Map<Film,Rating>> sameFilms=new HashMap();
        
        for(Person p:reviewers){
        
      
        
        
        
        sameFilms.put(p,register.getPersonalRatings(p));
        
       
        
            
        
        
        
        }
        
      
        return sameFilms;
    
    }
       
       
    
    
    private Film recomendedFilm (Person person,Map<Person,Map<Film,Rating>> commonWatched){
        
          
         
         
         List<Person> persons=new ArrayList<Person>(commonWatched.keySet());
         List<Film> personRatedFilms=new ArrayList<Film>(register.getPersonalRatings(person).keySet());
         
         
         
         Map<Film,Rating> bestMatch=new HashMap();
        
        
                  
         
         
         int tasteValue=Integer.MIN_VALUE;
         
          Film bestFilm=null;
         int helperValue=1;
         Person tasted=null;
         
         for(Person p:persons){
         
             List<Film> otherRatedFilms=new ArrayList<Film>(register.getPersonalRatings(p).keySet());
             
             int compareValue=0;
             
             for(Film film:personRatedFilms){
             
                 
            if(otherRatedFilms.contains(film))
            {
                
              
                int p1=register.getRating(person, film).getValue();
                int p2=register.getRating(p, film).getValue();
                
                compareValue=compareValue+p1*p2;
                
               
                
            
            }   
            
        
             
             
             }
             
            if(compareValue>tasteValue){
                
                
                bestMatch=commonWatched.get(p);
                
                tasted=p;
                
                tasteValue=compareValue;
                
                
                
            
            }
         
             
         
         
         }
      
         
         
         for(Film film:bestMatch.keySet()){
             
         
         if(!personRatedFilms.contains(film) && register.getRating(tasted, film).getValue()>helperValue){
             bestFilm=film;
           
             
             helperValue=register.getRating(tasted, film).getValue();
         }
         
         }
         
       
        
         return bestFilm;
         
         
    }
  
    
}
