
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    
    public boolean larger(Apartment otherApartment){
    
    
        if(otherApartment.squareMeters<this.squareMeters)
            
         return true;
        else
        return false;
    
    
    }
    
     public int priceDifference(Apartment otherApartment){
     
     int difference=pricePerSquareMeter*squareMeters-(otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
     if(difference<0){
     
     difference=difference*(-1);
     }
     
     return difference;
     }
     
     
     public boolean moreExpensiveThan(Apartment otherApartment){
     
          int difference=pricePerSquareMeter*squareMeters-(otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
     if(difference<0){
     
     return false;
     }
     else{
     
     return true;
     }
     
     
      }
    
}
