package com.vincentSenjayaJSleepDN;


import java.util.*;
/**
 * Class Algorithm yang dipakai untuk menerapkan fungsi yang diterapkan ke collection
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2022
 */
public class Algorithm {
    private Algorithm() {
    }

    /**
     * @param <T>
     * @param array
     * @param value
     * @return
     */
    public static <T> int count(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it, value);
    }

    /**
     *
     * @param <T>
     * @param iterable
     * @param value
     * @return
     */
    public static <T> int count(Iterable<T> iterable, T value) {
        final Iterator<T> it = iterable.iterator();
        return count(it, value);
    }

    /**
     *
     * @param <T>
     * @param iterator
     * @param value
     * @return
     */
    public static <T> int count(Iterator<T> iterator, T value) {
        final Predicate<T> pred = value::equals;
        return count(iterator, pred);
    }

    /**
     *
     * @param <T>
     * @param array
     * @param pred
     * @return
     */
    public static <T> int count(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param pred
     * @return
     */
    public static <T> int count(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> it = iterable.iterator();
        return count(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param pred
     * @return
     */
    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        int count = 0;
        while (iterator.hasNext())
            if (pred.predicate(iterator.next()))
                ++count;
        return count;
    }
    /**
     *
     * @param <T>
     * @param array
     * @param value
     * @return
     */
    public static <T> T find(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param value
     * @return
     */
    public static <T> T find(Iterable<T> iterable, T value) {
        final Iterator<T> it = iterable.iterator();
        return find(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param value
     * @return
     */
    public static <T> T find(Iterator<T> iterator, T value) {
        final Predicate<T> pred = value::equals;
        return find(iterator, pred);
    }
    /**
     *
     * @param <T>
     * @param array
     * @param pred
     * @return
     */
    public static <T> T find(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param pred
     * @return
     */
    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> it = iterable.iterator();
        return find(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param pred
     * @return
     */
    public static <T> T find(Iterator<T> iterator, Predicate<T> pred) {
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (pred.predicate(current))
                return current;
        }
        return null;
    }
    /**
     *
     * @param <T>
     * @param array
     * @param value
     * @return
     */
    public static <T> boolean exists(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param value
     * @return
     */
    public static <T> boolean exists(Iterable<T> iterable, T value) {
        final Iterator<T> it = iterable.iterator();
        return exists(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param value
     * @return
     */
    public static <T> boolean exists(Iterator<T> iterator, T value) {
        final Predicate<T> pred = value::equals;
        return exists(iterator, pred);
    }
    /**
     *
     * @param <T>
     * @param array
     * @param pred
     * @return
     */
    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param pred
     * @return
     */
    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> it = iterable.iterator();
        return exists(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param pred
     * @return
     */
    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (pred.predicate(current))
                return true;
        }
        return false;
    }
    /**
     *
     * @param <T>
     * @param array
     * @param value
     * @return
     */
    public static <T> List<T> collect(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param value
     * @return
     */
    public static <T> List<T> collect(Iterable<T> iterable, T value) {
        final Iterator<T> it = iterable.iterator();
        return collect(it, value);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param value
     * @return
     */
    public static <T> List<T> collect(Iterator<T> iterator, T value) {
        final Predicate<T> pred = value::equals;
        return collect(iterator, pred);
    }
    /**
     *
     * @param <T>
     * @param array
     * @param pred
     * @return
     */
    public static <T> List<T> collect(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param pred
     * @return
     */
    public static <T> List<T> collect(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> it = iterable.iterator();
        return collect(it, pred);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param pred
     * @return
     */
    public static <T> List<T> collect(Iterator<T> iterator, Predicate<T> pred) {
        ArrayList<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (pred.predicate(current))
                list.add(current);
        }
        return list;
    }
    /**
     *
     * @param <T>
     * @param array
     * @param page
     * @param pageSize
     * @param pred
     * @return
     */
    public static <T> List<T> paginate(T[] array, int page, int pageSize, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return paginate(it, page, pageSize, pred);
    }
    /**
     *
     * @param <T>
     * @param iterable
     * @param page
     * @param pageSize
     * @param pred
     * @return
     */
    public static <T> List<T> paginate(Iterable<T> iterable, int page, int pageSize, Predicate<T> pred) {
        final Iterator<T> it = iterable.iterator();
        return paginate(it, page, pageSize, pred);
    }
    /**
     *
     * @param <T>
     * @param iterator
     * @param page
     * @param pageSize
     * @param pred
     * @return
     */
    public static <T> List<T> paginate(Iterator<T> iterator, int page, int pageSize, Predicate<T> pred) {
        int occurences = 0;
        int startingIdx = page * pageSize;
        List<T> pageList = new ArrayList<>(pageSize);
        // skip first occurrences of element
        while (iterator.hasNext() && occurences < startingIdx) {
            T obj = iterator.next();
            if (pred.predicate(obj))
                ++occurences;
        }
        // get the next occurrences of element
        while (iterator.hasNext() && pageList.size() < pageSize) {
            T obj = iterator.next();
            if (pred.predicate(obj))
                pageList.add(obj);
        }
        return pageList;
    }
}