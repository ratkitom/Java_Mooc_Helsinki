import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int number;
        int sum=0;
        int counter=0;
        double avarage=0;
        int even=0;
        int odd=0;
        
        while(true){
        
            number=Integer.parseInt(reader.next());
            
            if (number==-1) {
                avarage=(double) sum/counter;
                System.out.println("Thank you see you later !");
                System.out.println("The sum is "+sum);
                System.out.println("How many numbers: "+counter);
                System.out.println("Average: "+ avarage);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
            sum=sum+number;
            counter=counter+1;
            
            if(number%2==0){
            even=even+1;
            
            }
            else{
            
            odd=odd+1;
            
            }
            
            
        
        
        
        
        
        }
        
        
        
        

    }
}
