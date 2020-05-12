
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money added){
    
        return new Money(this.euros+added.euros,this.cents+added.cents);
    
    }
    
    public boolean less(Money compared){
    
        if(this.euros<compared.euros){
        return true;
        } else if(this.euros==compared.euros){
            
            if(this.cents<compared.cents){
            return true;
            }
            
        
        }
        
        return false;
    
    
    }
    
    public Money minus(Money decremented){
    
    int euros=this.euros-decremented.euros;
    int cents=this.cents-decremented.cents;
    
    if(cents<0){
    
    euros-=1;
    cents=100+cents;
    } else if(euros<0){
    
    return new Money(0,0);
    
    }
    
    return new Money(euros,cents);
    
    
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
