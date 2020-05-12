
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int first=Integer.parseInt(reader.next());
        
        System.out.print("Last: ");
        int last=Integer.parseInt(reader.next());
        
        int i=first;
        int sum=0;
        
        while(i<=last){
        
        sum=sum+i;
        i++;
        
        }
        System.out.println("The sum is "+ sum);
        
    }
}
