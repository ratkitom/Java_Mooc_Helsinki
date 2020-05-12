
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
        System.out.print("Type your word: ");
        String name=reader.nextLine();
        System.out.print("Length of the first part: ");
        int firstpart=Integer.parseInt(reader.nextLine())-1;
        int i=0;
        
        System.out.print("Result: ");
        while(i<=firstpart){
        
            System.out.print(name.charAt(i));
            i++;
        
        }
        
    }
}
