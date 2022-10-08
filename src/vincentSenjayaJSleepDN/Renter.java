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
    
    public Renter(int id, String username){
        super(id);
        this.username = username;
    }
    
    public Renter(int id, String username, String address){
        super(id);
        this.username = username;
    }
    
    public Renter(int id, String username, int phoneNumber){
        super(id);
        this.username = username;
    }
    
    public Renter(int id, String username, int phoneNumber, String address){
        super(id);
        this.username = username;
    }
}
