package vincentSenjayaJSleepDN;
import java.util.*;
import java.text.*;

public class Payment extends Invoice
{
    public Calendar to;
    public Calendar from;
    private int roomId;
   
    public Payment(int id, int buyerId, int renterId, int roomId){
        super(id, buyerId, renterId);
        this.roomId = roomId;
        this.to = Calendar.getInstance();
        this.to.add(Calendar.DATE,2);
        this.from = Calendar.getInstance();
    }
    
    public Payment(int id, Account buyer, Renter renter, int roomId){
        super(id, buyer, renter);
        this.roomId = roomId;
        this.to = Calendar.getInstance();
        this.to.add(Calendar.DATE,2);
        this.from = Calendar.getInstance();
    }
    public String getDuration(){
        SimpleDateFormat SDformat = new SimpleDateFormat("d MMMMM yyyy");
        return (SDformat.format(from.getTime()) + " - " + SDformat.format(to.getTime()));
    }
    public String getTime(){
        SimpleDateFormat SDformat = new SimpleDateFormat("d MMMMM yyyy");
        return ("Formatted Date: " + SDformat.format(from.getTime()));
    }
    public String print(){
        return (String)( "Dari: " + from + "\nHingga: " + to + "\nRoom Id: " + roomId + "\nBuyer: " +buyer + "\nRenter: " + renter);
    }
    
    public int getRoomId(){
        return roomId;
    }
}
