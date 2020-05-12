package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection wordinspection=new WordInspection(file);
        
        for(String word:wordinspection.wordsWhichContainAllVowels()){
        
                System.out.println(word);
        
        
        }

    }
}
