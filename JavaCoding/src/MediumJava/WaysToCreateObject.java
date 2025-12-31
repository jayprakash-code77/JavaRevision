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



class UsingCloneMethod implements Cloneable{
    String name = "Jai Bhavani";
    public UsingCloneMethod() {
;   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class WaysToCreateObject {
    public static void main(String args[]) {

        ////    1. Using "new" keyword
//    RoomListing room = new RoomListing(1, "Jayprakash");




////    2. Using Reflection
//        try {
//            Class<?> c = Class.forName("MediumJava.RoomListing");
//            RoomListing s = (RoomListing) c.getDeclaredConstructor(int.class, String.class).newInstance(1, "Jayprakash");
//
//
//            System.out.println(s.ownerName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }










//// using the clone() method
//
//        UsingCloneMethod useClone = new UsingCloneMethod();
//        try {
//            UsingCloneMethod useCline2 = (UsingCloneMethod) useClone.clone();
//            System.out.println(useCline2.name);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("CloneNotSupportedException");
//        }











//        Using Deserialization
        






    }
}
