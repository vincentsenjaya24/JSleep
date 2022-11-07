package com.vincentSenjayaJSleepDN;
import java.util.*;

public class Room extends Serializable
{
    public BedType bedType;
    public int accountId;
    public Facility facility;
    public City city;
    public int size;
    public String name;
    public ArrayList<Date> booked;
    public String address;
    public Price price;

    public Room(int accountId, String name, int size, Price price, Facility facility, City city, String address){
        this.accountId = accountId;
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
