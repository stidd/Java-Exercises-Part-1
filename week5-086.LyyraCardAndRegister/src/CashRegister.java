
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    private static final double priceOfEconomical = 2.5;
    private static final double priceOfGourmet = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
      
        if(cashGiven < priceOfEconomical){
            return cashGiven;
        }
        
        this.cashInRegister += priceOfEconomical;
        this.economicalSold++;
        return cashGiven - priceOfEconomical; 
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
         if(cashGiven < priceOfGourmet){
            return cashGiven;
        }
        
        this.cashInRegister += priceOfGourmet;
        this.gourmetSold++;
        return cashGiven - priceOfGourmet; 
     
    }
    
    public boolean payEconomical(LyyraCard card){
        
        if(card.balance() >= priceOfEconomical){
            economicalSold++;
            card.pay(priceOfEconomical);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card){
        
        if(card.balance() >= priceOfGourmet){
            gourmetSold++;
            card.pay(priceOfGourmet);
            return true;
        }else{
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
