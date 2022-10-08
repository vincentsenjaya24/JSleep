package vincentSenjayaJSleepDN;



public class Complaint extends Serializable
{
    public String desc;
    public String date;
    public Complaint(int id, String date, String desc){
        super(id);
        this.date = date;
        this.desc = desc;
    }
    public String toString(){
        return (String)("Tanggal: " + date + "\nDeskripsi: " + desc);
    }
}
