import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        doSomething(lukija);
        
        
        
    }
    
    
    public static void doSomething(Scanner scanner){
    
     //   ArrayList<Integer> scores=new ArrayList();
        
        int [] scores=new int[6];
        
        int score=0;
        int allscores=0;
        int acceptedscores=0;
        System.out.println("Type exam scores, -1 completes:");
        while(true){
        
        score=scanner.nextInt();
        
        if(score==-1){
        
        break;
        }
        
        if(score>=0&&score<=60){
        
            allscores++;
            if(score>=0 && score<=29){
            
                scores[0]=scores[0]+1;
            }
            
             if(score>=30 && score<=34){
            
                scores[1]=scores[1]+1;
            }
             
             if(score>=35 && score<=39){
            
                scores[2]=scores[2]+1;
            }
            
             if(score>=40 && score<=44){
            
                scores[3]=scores[3]+1;
            }
             
             if(score>=45 && score<=49){
            
                scores[4]=scores[4]+1;
            }
              
             if(score>=50 && score<=60){
            
                scores[5]=scores[5]+1;
            }
            
             }
        
        
             
        
        
        
        }
        
        acceptedscores=allscores-scores[0];
        
        
        
        
        
        System.out.println("Grade distribution:");
        
        int j=0;
        for(int i=5;i>=0;i--){
        
            System.out.print(i+": ");
            
            while(j<scores[i]){
            
                System.out.print("*"); 
                j++;
            
            }
            j=0;
            System.out.println();
            
        
        
        }
        
        System.out.println("Acceptance percentage:"+ (double)100*acceptedscores/allscores);
        
        
        
       
        
        
        
    
    
    }
    
}
