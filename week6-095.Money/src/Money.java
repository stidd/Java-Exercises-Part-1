
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

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        int euroSum = euros + added.euros();
        int centSum = cents + added.cents();
 
        if (centSum > 99) {
            centSum -= 100;
            euroSum++;
        }
 
        return new Money(euroSum, centSum);
    }
    
    public boolean less(Money compared){
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() > compared.euros()) {
            return false;
        } else if (this.cents() < compared.cents()) {
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decremented){
        int euroDifference = euros - decremented.euros();
        int centDifference = cents - decremented.cents();
 
        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }
 
        if (euroDifference < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDifference, centDifference);
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
