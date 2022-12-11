package com.vincentSenjayaJSleepDN;
/**
 * Class Price berisi informasi mengenai harga
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */

public class Price
{
    

    public double price;
    public double discount;

    public Price(double price){
       this.price = price;
       this.discount = 0;
    }
    
    public Price(double price, double discount){
       this.price = price;
       this.discount = discount;

    }
    
    public String toString(){
        return (String)("Price: " + price + "\nDiscount: " + discount);
    }
}
