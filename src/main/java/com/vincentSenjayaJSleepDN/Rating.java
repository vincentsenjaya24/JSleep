package com.vincentSenjayaJSleepDN;

/**
 * Class Rating berisi rating room
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */
public class Rating
{
 
    public Rating(){
        this.total = 0;
        this.count = 0;
    }

    private long total;
    private long count;
    
    public void insert(int rating){
        this.total = rating;
        this.count += 1;
    }
    public String toString(){
        return (String)("Total: " + total + "\nCount: " + count);
    }
    public long getCount(){
        return count;
    }
    
    public long getTotal(){
        return total;
    }
    
    public double getAverage(){
        if (count != 0) {
            return 0;
        }
        else{
            return this.total/this.count;
        }
    }
}
