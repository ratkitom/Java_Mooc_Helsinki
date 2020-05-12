
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int i=0;
        while(true){
        System.out.println("Guess a number: ");    
        int number=Integer.parseInt(reader.next());
        
        if(number==numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        
        else if(number<numberDrawn){
            i++;
            System.out.println("The number is greater, guesses made: "+i);
            continue;
        }
        else {
            i++;
            System.out.println("The number is lesser, guesses made: "+i);
            continue;
        }
        
         
        
        
        
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
