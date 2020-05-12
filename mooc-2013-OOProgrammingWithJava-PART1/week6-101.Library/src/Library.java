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

public class Library {
    
    
    private  ArrayList<Book> books=new ArrayList();
    
    
    public Library(){}
    
    public void addBook(Book newBook){
    
       books.add(newBook);
    }
    
    public void printBooks(){
    
        for(Book temp:books){
        
            System.out.println(temp);
        }
        
    }
    
    
    public ArrayList<Book> searchByTitle(String title){
    
    ArrayList<Book> found=new ArrayList();
    
    
      for(Book temp:books){
        
          if(StringUtils.included(temp.title(), title)){
          
              found.add(temp);
          
          }  
          
        }
    
    
      
      return found;
    
    
    }
    
    
    public ArrayList<Book> searchByPublisher(String publisher){
    
        ArrayList<Book> found=new ArrayList();
    
    
      for(Book temp:books){
        
          if(StringUtils.included(temp.publisher(), publisher)){
          
              found.add(temp);
          
          }  
          
        }
    
    
      
      return found;
    
    
    
    }
    
    
    public ArrayList<Book> searchByYear(int year){
    
           ArrayList<Book> found=new ArrayList();
    
    
      for(Book temp:books){
        
          if(temp.year()==year){
          
              found.add(temp);
          
          }  
          
        }
    
    
      
      return found;
    
    
    
    
    }
    
    
    
    
   
    
    
}
