package vincentSenjayaJSleepDN;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.sql.Date;

public class JSleep
{
    public static void main(String[] args){
        //membuat object room A dan B
        Room RoomA = JSleep.createRoom();
        Room RoomB = JSleep.createRoom();
        
        //Tes apakah ruangan A masih kosong -> seharusnya kosong sehingga return true
        System.out.println("Membuat booking dari tanggal 15 hingga 20");
        Date start = Date.valueOf("2022-8-15");
        Date end = Date.valueOf("2022-8-20");
        //Tes apakah ruangan A masih kosong -> seharusnya tidak sehingga return false
        System.out.println(Payment.makeBooking(start,end,RoomA));
        System.out.println("Membuat booking dari tanggal 18 hingga 20");
        Date start2 = Date.valueOf("2022-8-18");
        Date end2 = Date.valueOf("2022-8-20");
        //Tes apakah ruangan B masih kosong -> seharusnya kosong sehingga return true
        System.out.println(Payment.makeBooking(start2,end2,RoomA));
        System.out.println("Membuat booking dari tanggal 18 hingga 20 untuk kamar berbeda");
        Date start3 = Date.valueOf("2022-8-18");
        Date end3 = Date.valueOf("2022-8-20");
        System.out.println(Payment.makeBooking(start3,end3,RoomB));
        //Tes apakah bila from setelah to valid? -> seharusnya tidak valid sehingga return false
        System.out.println("Membuat booking dari tanggal 20 hingga 15");
        Date start4 = Date.valueOf("2022-8-20");
        Date end4 = Date.valueOf("2022-8-15");
        System.out.println(Payment.makeBooking(start4,end4,RoomA));
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
