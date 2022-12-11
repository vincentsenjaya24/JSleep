package com.vincentSenjayaJSleepDN;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.vincentSenjayaJSleepDN.dbjson.JsonDBEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Driver class dari project JSleep
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */
@SpringBootApplication public class JSleep
{

    public static void main(String[] args){
        JsonDBEngine.Run(JSleep.class);
        SpringApplication.run(JSleep.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> JsonDBEngine.join()));

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
