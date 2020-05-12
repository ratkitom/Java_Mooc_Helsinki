public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
          while(amount>0){
        
            System.out.print("*");
            amount--;
        }
        
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        
          while(amount>0){
        
            System.out.print(" ");
            amount--;
        }
        
       
        // 40.1
    }

    public static void printTriangle(int size) {
        
        int i=0;
        
        while(size>0){
            i++;
            printWhitespaces(size-1);
            printStars(i);
           
             
            
            size--;
        
        
        
        
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        
        int i=1;
        int x=((height-1)*2+1)/2-1;
        
        
        while(height>0){
        
             printWhitespaces(height-1);
             printStars(i);
             
             i=i+2;
             height--;
        
       
        
        
        }
        
       
        int j=2;
        while(j>0){
        
        
        printWhitespaces(x);
        printStars(3);
        j--;
        
        }
        
        
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
