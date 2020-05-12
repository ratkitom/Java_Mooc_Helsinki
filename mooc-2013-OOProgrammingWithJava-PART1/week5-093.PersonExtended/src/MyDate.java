
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
               
        int difference=0;
           
       
    
    
    if(month<compared.month ||(month==compared.month&&day<=compared.day)){
    
    difference=compared.year-year;
    
    }
    
    else{
    
    
    difference=compared.year-year-1;
    }
    
     
    
    
    
    
  
       
       
       return difference;
    }

    public int getYear(){
    
    
       return this.year;
    }
    
    public int getMonth(){
    
    return this.month;
    
    }
    
    public int getDay(){
       
        return this.day;
    }
    
    
  
}
