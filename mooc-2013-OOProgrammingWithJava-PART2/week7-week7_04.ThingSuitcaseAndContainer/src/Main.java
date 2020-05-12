
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
       
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        
        for(int i=1;i<=100;i++){
        
        Thing thing=new Thing("Brick",i);
        Suitcase suitcase=new Suitcase(100);
        suitcase.addThing(thing);
        container.addSuitcase(suitcase);
        
        
        }
    }
        
    

}
