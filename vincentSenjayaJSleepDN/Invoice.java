package vincentSenjayaJSleepDN;
import java.util.*;

public class Invoice extends Serializable
{
   public int buyerId;
   public int renterId;
   public Calendar time;
   public PaymentStatus status;
   public RoomRating rating;
   public Account buyer;
   public Renter renter;
   
   public enum RoomRating{
       NONE,BAD,NEUTRAL,GOOD
   }
   
   public enum PaymentStatus{
       FAILED,WAITING,SUCCESS
   }
   
   protected Invoice(int id, int buyerId, int renterId){
       super(id);
       this.buyerId = buyerId;
       this.renterId = buyerId;
       this.rating = RoomRating.NONE;
       this.status = PaymentStatus.WAITING;
       this.time = Calendar.getInstance();
   }
   
   public Invoice(int id, Account buyer, Renter renter){
       super(id);
       this.buyer = buyer;
       this.renter = renter;
       this.rating = RoomRating.NONE;
       this.status = PaymentStatus.WAITING;
       this.time = Calendar.getInstance();
   }
   
   public String print(){
       return (String)("Buyer ID: " +buyerId + "\nRenter ID: " + renterId  + "\nTimer: " +  time + "\nBuyer: " + buyer + "\nRealize: " + renter);
   }
}
