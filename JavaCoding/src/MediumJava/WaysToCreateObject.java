package MediumJava;
import java.lang.reflect.Constructor;

class RoomListing {
    String ownerName;
    String address;
    float price;
    int ID;
    RoomListing(int ID, String ownerName) {
        this.ID = ID;
        this.ownerName = ownerName;
    }
    int getID() {
        return ID;
    }
}



class Stud {
    public Stud() {

;   }
}
public class WaysToCreateObject {
    public static void main(String args[]) {
        ////    1. Using "new" keyword
//    RoomListing room = new RoomListing(1, "Jayprakash");




//    2. Using Reflection
        try {
            Class<?> c = Class.forName("MediumJava.RoomListing");
            RoomListing s = (RoomListing) c.getDeclaredConstructor(int.class, String.class).newInstance(1, "Jayprakash");


            System.out.println(s.ownerName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
