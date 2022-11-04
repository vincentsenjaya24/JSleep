package vincentSenjayaJSleepDN;

public class ThreadingObject extends Thread {
    public ThreadingObject(String name){
        super(name);
        Thread thread = new Thread();
    }
    public void run(){
        System.out.println("Nama Thread: " + super.getName() + "ID Thread:" + super.getId());
    }
}
