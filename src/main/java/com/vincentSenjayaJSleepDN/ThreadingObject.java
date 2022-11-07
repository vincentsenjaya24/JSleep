package com.vincentSenjayaJSleepDN;

public class ThreadingObject extends Thread {
    public ThreadingObject(String name){

        this.setName(name);
    }
    @Override public void run(){
        System.out.println("Nama Thread: " + Thread.currentThread().getName() + " ID Thread: " + Thread.currentThread().getId());
    }
}
