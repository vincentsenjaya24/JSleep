package vincentSenjayaJSleepDN;


import java.io.File;
import java.io.IOException;
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
        for (int i = 0; i < 10; i++){
            ThreadingObject thread = new ThreadingObject("Thread " + i );
        }
//        for (int i = 0; i < 10; i++){
//            thread.run
//        }
//        try{
////            String filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\json\\randomRoomList.json";
//            String filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\json\\account.json";
////            JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
//            File fileAccount = new File(filepath);
//            if (fileAccount.createNewFile()) {
//                System.out.println("File Created");
//           }
//            JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
//            Account writeAccount = new Account("name","email","password");
//            JsonTable.writeJson(writeAccount,filepath);
//
//            for(Account a:tableAccount){
//                System.out.println(a.toString());
//            }
////            List<Account> data = Arrays.asList(filepath);
////            for (Account a: data){
////                System.out.println(a);
////            }
//
//
////            JsonTable<Room> tableRoom = new JsonTable<>(Room.class, filepath);
////            List<Room> filterTableRoom = filterByCity(tableRoom,"jakarta",0,5);
////            List<Room> filterTableRoom = filterByAccountId(tableRoom,1,0,5);
////            filterTableRoom.forEach(room -> System.out.println(room.toString()));
//        }
//        catch (IOException exception){
//            System.out.println("An unexpected error is occured");
//            exception.printStackTrace();
//        }
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
