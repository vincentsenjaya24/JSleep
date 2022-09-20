package vincentSenjayaJSleepDN;

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
