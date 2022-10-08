package vincentSenjayaJSleepDN;
import java.util.*;

public class Room extends Serializable implements FileParser
{
    public int size;
    public String name;
    public Facility facility;
    public Price price;
    public String address;
    public BedType bedType;
    public City city;
    public ArrayList<Date> booked;
    
    public Object write(){
        return 0;
    }
    public boolean read(String a){
        return false;
    }
    public Room(int id, String name, int size, Price price, Facility facility, City city, String address){
        super(id);
        this.name = name;
        this.price = price;
        this.size = size;
        this.facility = facility;
        this.city = city;
        this.address = address;
        this.bedType = BedType.SINGLE;
        this.booked = new ArrayList<Date>();
    }
    public String toString(){
        return (String)("Name: " + name + "\nAddress: " + address + "\nPrice: " + price.price
        + "\nBedType: " + bedType + "\nSize: " + size + "\nFacility: " + facility + "\nCity: "
        + city + "\nID: " + id);
    }
}
