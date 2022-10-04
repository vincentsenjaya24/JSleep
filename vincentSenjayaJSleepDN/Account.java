package vincentSenjayaJSleepDN;


/** 
   Class Account merupakan subclass dari Serializable
   @author VincentSenjaya
   @param Parameter merupakan nama, email, dan password
   
*/
public class Account extends Serializable implements FileParser
{
    public String name;
    public String email;
    public String password;
    
    public Object write(){
        return 0;
    }
    public boolean read(String a){
        return false;
    }
    
    public Account(int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String toString(){
        return (String)("Name: " + name + "\nEmail: " + email + "\nPassword: " + password + "\nID: " + id);
    }
}
