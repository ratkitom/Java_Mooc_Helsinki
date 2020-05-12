
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first=Integer.parseInt(reader.next());
        System.out.print("Last: ");
        int last=Integer.parseInt(reader.next());
        
        int i=first;
        while(i<=last){
            System.out.println(i);
            i++;
        }
        // write your code here

    }
}
