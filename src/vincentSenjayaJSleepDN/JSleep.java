package vincentSenjayaJSleepDN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.*;


public class JSleep
{
//    class Country{
//        public String name;
//        public int population;
//        public List<String> listOfStates;
//    }
    public static void main(String[] args){
        Renter testRegex = new Renter("Netlab_","081234567890","Jl Margonda Raya");
        Renter testRegexFail = new Renter("netlab","081","Jalan");
        System.out.println(testRegex.validate());
        System.out.println(testRegexFail.validate());
        try{
            String filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\json\\randomRoomList.json";
            JsonTable<Room> tableRoom = new JsonTable<>(Room.class, filepath);
            List<Room> filterTableRoom = filterByCity(tableRoom,"jakarta",0,5);
            filterTableRoom.forEach(room -> System.out.println(room.toString()));
        }
        catch (Throwable t){
            t.printStackTrace();
        }
    }

    public static Room createRoom(){
        Price price = new Price(100000,5);
        Room room = new Room(1, "hotel", 30, price, Facility.AC, City.SURABAYA, "Jalan Sutomo");
        return room;
    }

    public static List<Room> filterByCity(List<Room> room, String search, int page, int pageSize){
        List<Room> tempRoom = new ArrayList<>();
        Predicate<Room> byCity = x -> (x.city.toString()).equals(search.toUpperCase());
        for(Room each: room){
            String kota = each.city.toString();
            if ((kota).equals(search.toUpperCase())){
                tempRoom.add(each);
            }
        }
        return Algorithm.paginate(tempRoom, page, pageSize,byCity);
    }
    public static List<Room> filterByPrice(List<Room> room, double minPrice, double maxPrice){
        List<Room> tempRoom = new ArrayList<>();
        Predicate<Room> byPrice = x -> x.price.price>= minPrice &&  x.price.price<= maxPrice;
        for(Room each: room){
            double harga = each.price.price;
            if (harga >= minPrice && harga <= maxPrice){
                tempRoom.add(each);
            }
        }
        return Algorithm.collect(tempRoom, byPrice);
    }
    public static List<Room> filterByAccount(List<Room> room, int accountId, int page, int pageSize){
        List<Room> tempRoom = new ArrayList<>();
        for(Room each: room){
            if (each.id == accountId){
                tempRoom.add(each);
            }
        }
        return Algorithm.paginate(tempRoom, page, pageSize,pred -> pred.id == accountId);
    }
}
