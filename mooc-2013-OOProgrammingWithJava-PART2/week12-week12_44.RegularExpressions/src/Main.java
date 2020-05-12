
import java.util.Scanner;

public class Main {
    
    
    
    public static boolean isAWeekDay(String string){
    
      if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
      
          return true;
      
      } else {
      
      return false;
      
      }
    
      
        
    
    }
    
     public static boolean allVowels(String string){
     
     
         if(string.matches("(a|i|e|y|o|u|ä|ö|y])*")){
     
             return true;
     
        }   else{
         
             return false;
         }
         
     }
     
     public static boolean clockTime(String string){
     
     
         if(string.matches("0[0-9]:[0-5][0-9]:[0-5][0-9]")){
         
             return true;
                
         } else if(string.matches("1[0-9]:[0-5][0-9]:[0-5][0-9]")){
             
             return true;
         
         } else if(string.matches("2[0-3]:[0-5][0-9]:[0-5][0-9]")) {
         
             return true;
         }  else return false;
         
         
     }
    

    public static void main(String[] args) {
        // write test code here
        
    
        
        
        
        
        
        
        
    }
}
