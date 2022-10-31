package vincentSenjayaJSleepDN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;


public class JSleep
{
    class Country{
        public String name;
        public int population;
        public List<String> listOfStates;
    }
    public static void main(String[] args){
       String filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\vincentSenjayaJSleepDN\\city.json";
       Gson gson = new Gson();
       try{
           BufferedReader br = new BufferedReader(new FileReader(filepath));
           Country input = gson.fromJson(br, Country.class);
           System.out.println("name: " + input.name);
           System.out.println("population: " + input.population);
           System.out.println("states: ");
           input.listOfStates.forEach(state -> System.out.println(state));
        }
       catch (IOException e){
           e.printStackTrace();
       }
    }
    
//    public static int getHotelId(){
//        return 0;
//    }
//    public static Room createRoom(){
//        Price price = new Price(100000,5);
//        Room room = new Room(1, "hotel", 30, price, Facility.AC, City.SURABAYA, "Jalan Sutomo");
//        return room;
//    }
//    public static String getHotelName(){
//        return "hotel";
//    }
//
//    public static boolean isDiscount(){
//        return true;
//    }
//
//    public static float getDiscountPercentage(int beforeDiscount, int afterDiscount){
//        if (beforeDiscount < afterDiscount) {
//            return 0.0f;
//        }
//
//        return (float)(100 - (afterDiscount*100/beforeDiscount));
//    }
//
//    public static int getDiscountedPrice(int price, float discountPercentage){
//        if (discountPercentage > 100) {
//            return 0;
//        }
//        return (int)((1- (discountPercentage/100)) * price);
//    }
//
//    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
//         return (int)((100* discountedPrice)/(100 - discountPercentage));
//    }
//
//    public static float getAdminFeePercentage(){
//        return 0.05f;
//    }
//
//    public static int getAdminFee(int price){
//        return (int)((price)*(getAdminFeePercentage()));
//    }
//
//    public static int getTotalPrice(int price, int numberOfNight){
//        return ((price*numberOfNight) + getAdminFee(price * numberOfNight));
//    }
}
