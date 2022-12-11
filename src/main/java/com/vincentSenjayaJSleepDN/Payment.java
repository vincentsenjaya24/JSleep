package com.vincentSenjayaJSleepDN;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 * Class Payment berisi proses pembayaran produk
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */

public class Payment extends Invoice {

    private int roomId;
    public Date from;
    public Date to;
    /**
     * Constructor Payment untuk inisialisasi pembelian produk
     * @param buyerId id customer
     * @param renterId id renter yang menyewakan
     * @param roomId id room yang ada
     */
    public Payment(int buyerId, int renterId, int roomId) {
        super(buyerId, renterId);
        this.roomId = roomId;

    }

    public Payment(Account buyer, Renter renter, int roomId) {
        super(buyer, renter);
        this.roomId = roomId;

    }

    public int getRoomId() {
        return roomId;
    }

    public static boolean makeBooking(Date from, Date to, Room room){
        return availability(from, to, room);
    }

    public static boolean availability(Date from,Date to,Room room){
        Calendar start = Calendar.getInstance();
        start.setTime(from);
        Calendar end = Calendar.getInstance();
        end.setTime(to);
        if(start.after(end) || start.equals(end)){
            return false;
        }
        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            if(room.booked.contains(date)){
                return false;
            }
        }
        return true;
    }
    @Override
    public String print(){
        return "Payment{" +
                "roomId=" + roomId +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

}