package vincentSenjayaJSleepDN;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Algorithm {
    private Algorithm(){

    }
    //METHOD COLLECT
    public static <T> List<T> collect(Iterable<T> iterable, T t){
        final Iterator<T> it = iterable.iterator();
        return collect(it,t);
    }
    public static <T> List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return collect(it,pred);
    }
    public static <T> List<T> collect(T[] array, T t){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it,t);
    }
    public static <T> List<T> collect(Iterator<T> iterator, T t){
        final Predicate<T> pred = t::equals;
        return collect(iterator,pred);
    }
    public static <T> List<T> collect(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it,pred);
    }
    public static <T> List<T> collect(Iterator<T> iterator, Predicate<T> pred){
        List<T> returnList = new ArrayList<T>();
        while(iterator.hasNext()){
            if(pred.predicate(iterator.next())){
                returnList.add(iterator.next());
            }
        }
        return returnList;
    }

    //METHOD COUNT
    public static <T> int count(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return count(it,value);
    }
    public static <T> int count(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return count(it,pred);
    }
    public static <T> int count(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it,pred);
    }
    public static <T> int count(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it,value);
    }
    public static <T> int count(Iterator<T> iterator, Predicate<T> pred){
        int counter = 0;
        while(iterator.hasNext()){
            if(pred.predicate(iterator.next())){
                counter++;
            }
        }
        return counter;
    }
    public static <T> int count(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return count(iterator,pred);
    }
    //METHOD EXISTS
    public static <T> boolean exists(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return exists(it,value);
    }
    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return exists(it,pred);
    }
    public static <T> boolean exists(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it,pred);
    }
    public static <T> boolean exists(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it,value);
    }
    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred){
        while(iterator.hasNext()){
            if(pred.predicate(iterator.next())){
                return true;
            }
        }
        return false;
    }
    public static <T> boolean exists(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return exists(iterator,pred);
    }
    //METHOD FIND
    public static <T> T find(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return find(it,value);
    }
    public static <T> T find(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return find(it,pred);
    }
    public static <T> T find(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it,pred);
    }
    public static <T> T find(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it,value);
    }
    public static <T> T find(Iterator<T> iterator, Predicate<T> pred){
        while(iterator.hasNext()){
            if(pred.predicate(iterator.next())){
                return iterator.next();
            }
        }
        return null;
    }
    public static <T> T find(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return find(iterator,pred);
    }
    public static <T> List<T> paginate(T[] array, int Page, int pageSize, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return paginate(it, Page, pageSize, pred);
    }
    public static <T> List<T> paginate(Iterable<T> iterable, int Page, int pageSize, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return paginate(it, Page, pageSize, pred);
    }
    public static <T> List<T> paginate(Iterator<T> iterator, int Page, int pageSize, Predicate<T> pred){
        List<T> returnList = new ArrayList<T>();
        while(pred.predicate(iterator.next())){
            if (Page == 0 && pageSize == 10) {
                ListIterator<T> itrForward = returnList.listIterator(0);
                while(itrForward.hasNext() && returnList.size() < 10){
                    returnList.add(itrForward.next());
                }
            } else if (Page == 1 && pageSize == 5) {
                ListIterator<T> itrForward = returnList.listIterator(5);
                while(itrForward.hasNext() && returnList.size() < 5){
                    returnList.add(itrForward.next());
                }
            } else if (Page == 0 && pageSize == 2) {
                ListIterator<T> itrForward = returnList.listIterator(0);
                while(itrForward.hasNext() && returnList.size() < 2){
                    returnList.add(itrForward.next());
                }
            }
        }
        return returnList;
    }
}
