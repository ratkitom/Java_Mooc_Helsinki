import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
              int sum=0;
        
        for(int temp:list){
        
        sum=sum+temp;
        }
        
        return sum;
        
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg=(double)sum(list)/list.size();
        
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        ArrayList<Double> set=new ArrayList();
        double avg=average(list);
        double value;
        double sum=0;
      
       for(int temp:list){
       
       value=temp-avg;
       value=value*value;
       
       sum=sum+value;
       
       }
       
       double sample=sum/(list.size()-1);
       
        
        
        
        
        return sample;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
