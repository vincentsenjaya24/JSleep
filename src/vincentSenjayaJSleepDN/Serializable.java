package vincentSenjayaJSleepDN;

import java.util.HashMap;

/**
   Class Serializable merupakan parent dari  class Account, Room, Renter, Invoice dan Voucher
   @author VincentSenjaya
   
*/
public class Serializable
{
    public final int id;
    private static HashMap<Class<?>, Integer> mapCounter = new HashMap<>();
    protected Serializable(){
        Integer counter = mapCounter.get(getClass());
        counter = counter == null ? 0 : counter + 1;
        mapCounter.put(getClass(), counter);
        this.id = counter;
    }
    public static <T extends Serializable> Integer setClosingId(Class<T> class1, int id)
    {
        return mapCounter.put(class1, id);
    }
    public static <T extends Serializable> Integer getClosingId(Class<T> class1)
    {
        return mapCounter.get(class1);
    }
    public int compareTo(Serializable parameter){
        return Integer.compare(parameter.id,this.id);
    }
    public boolean equals(Object objek){
        return (objek instanceof Serializable && ((Serializable)objek).id == id);
    }

    public boolean equals(Serializable parameter){
        return parameter.id == this.id;
    }
}
