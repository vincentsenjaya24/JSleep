package vincentSenjayaJSleepDN;

public class Room
{
    public int size;
    public String name;
    public Facility facility;
    public Price price;
    
    public Room(String name, int size, Price price, Facility facility){
        this.name = name;
        this.price = price;
        this.size = size;
        this.facility = facility;
    }
}
