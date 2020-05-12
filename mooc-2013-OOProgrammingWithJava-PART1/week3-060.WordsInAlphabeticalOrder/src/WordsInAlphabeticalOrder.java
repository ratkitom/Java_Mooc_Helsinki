
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        while(true){
        System.out.print("Type a word: ");
        
        word=reader.nextLine();
        if(word.isEmpty()){
        break;
        }
        else{
        
        words.add(word);
        
        
        }
        
        }
        
        System.out.println("You typed the following words:");
        Collections.sort(words);
        
        for(String temp:words){
        
            System.out.println(temp);
        
        }
    }
}
