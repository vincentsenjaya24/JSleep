package vincentSenjayaJSleepDN;


/** 
   Class Account merupakan subclass dari Serializable
   @author VincentSenjaya
   @param Parameter merupakan nama, email, dan password
   
*/
public class Account extends Serializable
{
    public String name;
    public String email;
    public String password;
    public Account(int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
}
