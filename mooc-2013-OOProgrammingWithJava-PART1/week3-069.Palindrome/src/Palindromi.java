import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        boolean check=false;
        
        if(text.equals(reverse(text))){
        
            check=true;
            
        }
        
        return check;
        
    }
    
    
        public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String helper="";
        
        int i=text.length()-1;
        
        while(i>=0){
        
        helper=helper+text.charAt(i);
        i--;
        
        }
        
        
        return helper;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
