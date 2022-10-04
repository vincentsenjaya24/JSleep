package vincentSenjayaJSleepDN;
import java.util.*;


public class Validate
{
    public Validate(){
        
    }
    public static ArrayList filter(Price[] list, int value, boolean less){
        ArrayList<Double> arrlist = new ArrayList<Double>();
        if (less == true) {
            for (int i = 0; i < list.length; i++){
                if (list[i].price <= value){
                    arrlist.add(list[i].price);
                }
            }
        }
        if (less == false) {
            for (int i = 0; i < list.length; i++){
                if (list[i].price > value){
                    arrlist.add(list[i].price);
                }
            }
        }
        return arrlist;
    }
}
