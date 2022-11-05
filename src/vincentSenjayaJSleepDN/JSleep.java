package vincentSenjayaJSleepDN;


import com.google.gson.Gson;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Array;
import java.util.ArrayList;

import java.util.List;

public class JSleep
{
//    class Country{
//        public String name;
//        public int population;
//        public List<String> listOfStates;
//    }
    public static void main(String[] args){
        Account testAccountFail = new Account("vincent","vincent senjaya@ui.ac.id","BC123456");
        Account testAccount = new Account("vincent","vincent.senjaya@ui.ac.id","aBC123456");
        System.out.println(testAccountFail.validate());
        System.out.println(testAccount.validate());
        for(int i = 0 ; i < 10 ; i++){
            ThreadingObject thread = new ThreadingObject("Thread"+i);
            thread.start();
        }

        try{
            String filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\json\\account.json";
            JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
            tableAccount.add(new Account("name","email","password"));
            tableAccount.writeJson();
            tableAccount = new JsonTable<>(Account.class, filepath);
            tableAccount.forEach(account -> System.out.println(account.toString()));
        }
        catch(Throwable t){
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
    public static List<Room> filterByAccountId(List<Room> room, int accountId, int page, int pageSize){
        List<Room> tempRoom = new ArrayList<>();
        for(Room each: room){
            if (each.accountId == accountId){
                tempRoom.add(each);
            }
        }
        return Algorithm.paginate(tempRoom, page, pageSize,pred -> pred.accountId == accountId);
    }
}
