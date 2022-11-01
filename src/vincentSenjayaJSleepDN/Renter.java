package vincentSenjayaJSleepDN;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
   Class Renter merupakan subclass dari Serializable
   @author VincentSenjaya
   
*/

public class Renter extends Serializable
{
    public String username;
    public String address;
    public String phoneNumber;
    public static final String REGEX_PHONE = "^(\\d{9,12})$";
    public static final String REGEX_NAME = "^(?=^[A-Z])(?![A-Z a-z]{20,})((?=[A-Z a-z]{4,}).)((?!\\s{2}).)*$";

    public Renter(String username, String phoneNumber, String address){
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.username = username;
    }
    public boolean validate() {
        Pattern patternName = Pattern.compile(REGEX_NAME);
        Matcher matcherName = patternName.matcher(username);
        Pattern patternPhone = Pattern.compile(REGEX_PHONE);
        Matcher matcherPhone = patternPhone.matcher(phoneNumber);
        return matcherName.find() && matcherPhone.find();
    }

}
