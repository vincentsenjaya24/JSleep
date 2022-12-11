package com.vincentSenjayaJSleepDN;
/**
 * Class untuk penerapan multi-threading
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */
public class ThreadingObject extends Thread {
    public ThreadingObject(String name){

        this.setName(name);
    }
    @Override public void run(){
        System.out.println("Nama Thread: " + Thread.currentThread().getName() + " ID Thread: " + Thread.currentThread().getId());
    }
}
