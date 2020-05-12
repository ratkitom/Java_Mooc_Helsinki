public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    
    public int differenceInYears(MyDate comparedDate){
        
      
       
        int difference=0;
           
       
    if(year>comparedDate.year){
    
    if(month>comparedDate.month ||(month==comparedDate.month&&day>=comparedDate.day)){
    
    difference=year-comparedDate.year;
    
    }
    
    else{
    
    
    difference=year-comparedDate.year-1;
    }
    
     }
    
    
    if(year<comparedDate.year){
    
        if(month<comparedDate.month ||(month==comparedDate.month&&day<=comparedDate.day)){
        
                difference=comparedDate.year-year;
        }
        else{
        
                difference=comparedDate.year-year-1;
        
        }
    
    
    }
    
    if(year==comparedDate.year){
    
    difference=0;
    }
       
       
       return difference;
    }    
           
       
           
           
         
        
    
   
    
    
    

}
