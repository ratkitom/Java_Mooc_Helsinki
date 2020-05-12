package reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.*;


public class Main {

    public static void main(String[] args) {
        // Test your code here
  
    RatingRegister rek = new RatingRegister();
Film saksiKasi = new Film("Saksikäsi");
Film eraserhead = new Film("Eraserhead");
Film haifisch = new Film("Haifisch");
Person pekka = new Person("Pekka");
rek.addRating(pekka, eraserhead, Rating.FINE);
rek.addRating(pekka, saksiKasi, Rating.FINE);
rek.addRating(saksiKasi, Rating.FINE);
rek.addRating(saksiKasi, Rating.GOOD);
rek.addRating(haifisch, Rating.BAD);
rek.addRating(haifisch, Rating.BAD);
Reference reference = new Reference(rek);
        System.out.println(reference.recommendFilm(new Person("Arto")));
    
    }
}
