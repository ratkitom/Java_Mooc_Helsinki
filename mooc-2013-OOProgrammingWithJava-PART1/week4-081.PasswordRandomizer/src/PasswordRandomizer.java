import java.util.Random;

public class PasswordRandomizer {
    // Define the variables

    int passwordLength;
    
    Random random=new Random();
    public PasswordRandomizer(int length) {
        // Initialize the variable
        
        this.passwordLength=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password="";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int number;
        int i=0;
        
        while(i<this.passwordLength){
        
        number=random.nextInt(26);
        
        password=password+alphabet.charAt(number);
        
        i++;
        
        }
        
        
        
        
        
        
        
        
        return password;
    }
}
