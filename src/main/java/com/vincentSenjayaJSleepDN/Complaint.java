package com.vincentSenjayaJSleepDN;


import com.vincentSenjayaJSleepDN.dbjson.Serializable;
/**
 * Class Complaint dipakai untuk membuat dan mengembalikan complaint terhadap layanan
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */
public class Complaint extends Serializable
{
    public String desc;
    public String date;
    public Complaint(String date, String desc){
        super();
        this.date = date;
        this.desc = desc;
    }
    public String toString(){
        return (String)("Tanggal: " + date + "\nDeskripsi: " + desc);
    }
}
