package vincentSenjayaJSleepDN;



public class JSleep
{
    
    public static void main(String[] args){
        
        Payment testRoom = new Payment(1,2,3,"20:30",203,"Monday","Sunday");
        Invoice testInvoice = new Invoice(1,2,3,"20:30");
        System.out.println("Print payment: \n");
        System.out.println(testRoom.print());
        System.out.println("\nPrint invoice: ");
        System.out.println(testInvoice.print());
    }
    
    public static int getHotelId(){
        return 0;
    }
    public static Room createRoom(){
        Price price = new Price(100000,5);
        Room room = new Room(1, "hotel", 30, price, Facility.AC);
        return room;
    }
    public static String getHotelName(){
        return "hotel";
    }
    
    public static boolean isDiscount(){
        return true;
    }
    
    public static float getDiscountPercentage(int beforeDiscount, int afterDiscount){
        if (beforeDiscount < afterDiscount) {
            return 0.0f;
        }
        
        return (float)(100 - (afterDiscount*100/beforeDiscount));
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage){
        if (discountPercentage > 100) {
            return 0;
        }
        return (int)((1- (discountPercentage/100)) * price);
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
         return (int)((100* discountedPrice)/(100 - discountPercentage));
    }
     
    public static float getAdminFeePercentage(){
        return 0.05f;
    }
    
    public static int getAdminFee(int price){
        return (int)((price)*(getAdminFeePercentage()));
    }
    
    public static int getTotalPrice(int price, int numberOfNight){
        return ((price*numberOfNight) + getAdminFee(price * numberOfNight));
    }
}
