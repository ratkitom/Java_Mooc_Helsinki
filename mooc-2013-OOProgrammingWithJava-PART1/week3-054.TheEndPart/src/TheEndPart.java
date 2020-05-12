import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
             Scanner reader = new Scanner(System.in);
        System.out.print("Type your word: ");
        String name=reader.nextLine();
        System.out.print("Length of the end part: ");
        int endpart=Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: "+name.substring(name.length()-endpart));
        
        
        
    }
}
