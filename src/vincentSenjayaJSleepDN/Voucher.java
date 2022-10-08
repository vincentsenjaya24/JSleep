package vincentSenjayaJSleepDN;


public class Voucher extends Serializable implements FileParser
{
   public Type type;
   public double cut;
   public String name;
   public int code;
   public double minimum;
   private boolean used;
   
   public Object write(){
        return 0;
   }
   public boolean read(String a){
        return false;
   }
   public Voucher(int id, String name, int code, Type type, boolean used, double minimum, double cut){
       super(id);
       this.name = name;
       this.code = code;
       this.type = type;
       this.minimum = minimum;
       this.cut = cut;
       this.used = used;
   }
   
   
   public boolean isUsed(){
       return used;
   }
   
   public boolean canApply(Price price){
       if (price.price > this.minimum && this.used == false) {
           return true;
       }
       else {
           return false;
       }
   }
   
   public double apply(Price price){
       this.used = true;
       if (this.type == Type.DISCOUNT) {
           return price.price * (100 - this.cut)/100;   
       }
       else {
           return price.price - this.cut;
       }
       
   }
}