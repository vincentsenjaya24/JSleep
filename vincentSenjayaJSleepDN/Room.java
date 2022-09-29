package vincentSenjayaJSleepDN;

public class Room extends Serializable
{
    public int size;
    public String name;
    public Facility facility;
    public Price price;
    public String address;
    public BedType bedType;
    public City city;
    
    public Room(int id, String name, int size, Price price, Facility facility, City city, String address){
        super(id);
        this.name = name;
        this.price = price;
        this.size = size;
        this.facility = facility;
        this.city = city;
        this.address = address;
    }
    public String toString(){
        return (String)("Name: " + name + "\nAddress: " + address + "\nPrice: " + price
        + "\nBedType: " + bedType + "\nSize: " + size + "\nFacility: " + facility + "\nCity: "
        + city);
    }
}
