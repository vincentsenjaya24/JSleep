package vincentSenjayaJSleepDN;
import java.util.*;
import java.text.*;
import java.util.ArrayList;

public class Payment extends Invoice
{
    public Date to;
    public Date from;
    private int roomId;
   
    public Payment(int buyerId, int renterId, int roomId, Date from, Date to){
        super(buyerId, renterId);
        this.roomId = roomId;
        this.from = from;
        this.to = to;
    }
    
    public Payment(Account buyer, Renter renter, int roomId, Date from, Date to){
        super(buyer, renter);
        this.roomId = roomId;
        this.from = from;
        this.to = to;
    }
    public static boolean makeBooking(Date from, Date to, Room room){
        if (from.after(to)) {
            return false;
        }
        else if(room.booked.isEmpty()) {
            room.booked.add(from);
            room.booked.add(to);
            return true;
        }
        else if (availability(from, to, room)) {
            room.booked.add(from);
            room.booked.add(to);
            return true;
        }
        else {
            return false;
        }
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
    
    public static boolean availability(Date from, Date to, Room room){

        if ((room.booked.get(0)).after(to) || (room.booked.get(1)).before(from)) {
            return true;
        }
        else if ((room.booked.get(0)).equals(to)|| (room.booked.get(1)).equals(from)) {
            return true;
        }
        else {
            return false;
        }
    }
}
