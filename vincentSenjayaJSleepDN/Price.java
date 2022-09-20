package vincentSenjayaJSleepDN;


public class Price
{
    
    public double rebate;
    public double price;
    public int discount;

    public Price(double price){
       this.price = price;
       this.discount = 0;
       this.rebate = 0;
    }
    
    public Price(double price, int discount){
       this.price = price;
       this.discount = discount;
       this.rebate = 0;
    }
    
    public Price(double price, double rebate){
       this.price = price;
       this.discount = 0;
       this.rebate = rebate;
    }
    
    private double getDiscountedPrice(){
        if (discount > 100) {
            return 100;
        }
        else if (discount == 100) {
            return 0;
        }
        else {
            return ((1- (discount/100)) * price);
        }
    }
    
    private double getRebatedPrice(){
        if (rebate > price) {
            return price;
        }
        else {
            return (price - rebate);
        }
    }
}
