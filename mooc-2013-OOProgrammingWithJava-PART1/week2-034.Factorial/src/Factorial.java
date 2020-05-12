import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number=Integer.parseInt(reader.next());
        int factorial=1;
        while(number>=1){
        
        factorial=factorial*number;
        number--;
        
        }

        
        System.out.println("Factorial is "+ factorial);
    }
}
