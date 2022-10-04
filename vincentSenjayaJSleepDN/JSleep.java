package vincentSenjayaJSleepDN;



public class JSleep
{
    public static void main(String[] args){
        Payment testPayment = new Payment(2, 2, 2,2);
        System.out.println(testPayment.getTime());
        System.out.println(testPayment.getDuration());
        Price[] unfilteredArray = new Price[5];
        for(int i=0;i < unfilteredArray.length;i++){
         int j = 5000;
         unfilteredArray[i] = new Price((i+1)*j);
        }
        System.out.println("Price List");
        for(int i=0;i < unfilteredArray.length;i++){
         System.out.println(unfilteredArray[i].price);
        }
        System.out.println("Below 12000.0");
        System.out.println(Validate.filter(unfilteredArray, 12000,true));
        System.out.println("Above 10000.0");
        System.out.println(Validate.filter(unfilteredArray, 10000,false));
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
