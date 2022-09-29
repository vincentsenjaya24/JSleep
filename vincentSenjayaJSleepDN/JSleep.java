package vincentSenjayaJSleepDN;



public class JSleep
{
    public static void main(String[] args){
        Complaint testComplain = new Complaint(1, "23 August 2022", "Bad Quality");
        Price testPrice = new Price(100000, 20000);
        Room testRoom = new Room(1, "Presidential Suite", 5, testPrice, Facility.FitnessCenter,
        City.DEPOK, "JL.Margonda Raya");
        Account testAccount = new Account(1, "Bob", "bob@gmail.com", "bob");
        Rating testRating = new Rating();
        System.out.println(testComplain.toString());
        System.out.println(testRoom.toString());
        System.out.println(testAccount.toString());
        System.out.println(testPrice.toString());
        System.out.println(testRating.toString());
    }
    
    public static int getHotelId(){
        return 0;
    }
    public static Room createRoom(){
        Price price = new Price(100000,5);
        Room room = new Room(1, "hotel", 30, price, Facility.AC, City.SURABAYA, "Jalan Sutomo");
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
