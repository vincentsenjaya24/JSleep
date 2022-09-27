package vincentSenjayaJSleepDN;


public class Invoice extends Serializable
{
   public int buyerId;
   public int renterId;
   public String time;
   public Account buyer;
   public Renter renter;
   public Invoice(int id, int buyerId, int renterId, String time){
       super(id);
       this.buyerId = buyerId;
       this.renterId = buyerId;
       this.time = time;

   }
   
   public Invoice(int id, Account buyer, Renter renter, String time){
       super(id);
       this.buyer = buyer;
       this.renter = renter;
       this.time = time;
   }
   
   public String print(){
       return (String)(buyerId + " " + renterId  + " " +  time + " " + buyer + " " + renter);
   }
}
