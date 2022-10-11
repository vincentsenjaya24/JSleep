package vincentSenjayaJSleepDN;

/** 
   Class Renter merupakan subclass dari Serializable
   @author VincentSenjaya
   
*/

public class Renter extends Serializable
{
    public int phoneNumber = 0;
    public String address = "";
    public String username;
    
    public Renter(String username){
        super();
        this.username = username;
    }
    
    public Renter(String username, String address){
        super();
        this.username = username;
    }
    
    public Renter(String username, int phoneNumber){
        super();
        this.username = username;
    }
    
    public Renter(String username, int phoneNumber, String address){
        super();
        this.username = username;
    }
}
