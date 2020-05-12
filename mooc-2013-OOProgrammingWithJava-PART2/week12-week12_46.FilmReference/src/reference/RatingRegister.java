/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.*;

/**
 *
 * @author tomasz
 */
public class RatingRegister {
    
    
    private Map<Film,List<Rating>> filmRatings;
    
    private Map<Person,Map<Film,Rating>> personalFilmRatings;
    
    public RatingRegister(){
    
    filmRatings=new HashMap();
    personalFilmRatings=new HashMap();
    
    }
    
    public void addRating(Film film, Rating rating){
    
        if(!filmRatings.containsKey(film)){
        
        List<Rating> list=new ArrayList();
        list.add(rating);
        filmRatings.put(film, list);
        
        
        } else{
        
        
            filmRatings.get(film).add(rating);
        }
        
    
    }
    
    public List<Rating> getRatings(Film film){
        
        List<Rating> ratings=filmRatings.get(film);
        
        
        
        return ratings;        
    
    }
    
    public Map<Film, List<Rating>> filmRatings(){
    
        return filmRatings;
        
    }
    
    public void addRating(Person person, Film film, Rating rating){
    
        Map<Film,Rating> personFilms;
        
        if(personalFilmRatings.containsKey(person)){
            
        personFilms=personalFilmRatings.get(person);
        
            if(!personFilms.containsKey(film)){
            
               personFilms.put(film, rating);
               
               addRating(film,rating);
                
             } 
            
        }else{
        
        
            personFilms=new HashMap();
            personFilms.put(film, rating);
            personalFilmRatings.put(person, personFilms);
            
            addRating(film,rating);
            
            
        } 
        
            
        
        
    
    }
    
    public Rating getRating(Person person, Film film){
    
       Map<Film,Rating> filmRating=personalFilmRatings.get(person);
       
       if(filmRating.containsKey(film)){
       
       return filmRating.get(film);
       
       }
       return Rating.NOT_WATCHED;
    
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
    
        
        
        if(personalFilmRatings.containsKey(person))
        
        return personalFilmRatings.get(person);
        
        else return new HashMap();
    
    }
    
    public List<Person> reviewers(){
    
    List<Person> reviewers=new ArrayList();
    Set<Person> set=personalFilmRatings.keySet();
    
    for(Person person:set){
    
        reviewers.add(person);
        
    
    }
    
    return reviewers;
    
    }
    
    
    
}
