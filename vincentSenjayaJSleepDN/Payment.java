package vincentSenjayaJSleepDN;


public class Payment extends Invoice
{
    public String to;
    public String from;
    private int roomId;
    public Account buyer;
    public Renter renter;
    
    public Payment(int id, int buyerId, int renterId, String time, int roomId, String from, String to){
        super(id, buyerId, renterId, time);
        this.roomId = roomId;
        this.to = to;
        this.from = from;
        
    }
    
    public Payment(int id, Account buyer, Renter renter, String time, int roomId, String from, String to){
        super(id, buyer, renter, time);
        this.roomId = roomId;
        this.to = to;
        this.from = from;
    }
    
    public String print(){
        return (String)( "Dari: " + from + "\nHingga: " + to + "\nRoom Id: " + roomId + "\nBuyer: " +buyer + "\nRenter: " + renter);
    }
    
    public int getRoomId(){
        return roomId;
    }
}
