
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        
        
        
        
    }
    
    
     private static void printWithSmileys(String characterString){
     
         String text=characterString;
         
         if(text.length()%2==0){
         
             text=" "+text+" ";
             
             
             for(int i=0;i<(text.length()/2)+2;i++){
             
                 System.out.print(":)");
             
             }
             System.out.println("");
             System.out.print(":)"+text+":)");
             System.out.println("");
                for(int i=0;i<(text.length()/2)+2;i++){
             
                 System.out.print(":)");
             
             }
                
                System.out.println("");
             
         }
         
         else{
         
                  text=" "+text+"  ";
             
             
             for(int i=0;i<(text.length()/2)+2;i++){
             
                 System.out.print(":)");
             
             }
             System.out.println("");
             System.out.print(":)"+text+":)");
             System.out.println("");
                for(int i=0;i<(text.length()/2)+2;i++){
             
                 System.out.print(":)");
             
             }
                
                System.out.println("");
         
         
         
         }
         
    
     
     
     
     }

}
