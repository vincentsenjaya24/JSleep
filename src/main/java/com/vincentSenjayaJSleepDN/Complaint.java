package com.vincentSenjayaJSleepDN;


import com.vincentSenjayaJSleepDN.dbjson.Serializable;

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
