package MediumJava;
import java.lang.reflect.Constructor;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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



class UsingDe_Serialization implements Serializable{
    public String name;
    public int age;
    transient String password;

    UsingDe_Serialization(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
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
        UsingDe_Serialization uds = new UsingDe_Serialization("Jaypraash", 22, "xCode995700");


//      Serialization
        try {
            FileOutputStream file = new FileOutputStream("ObjWithDeSerialization.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(uds);
            out.close();
            file.close();
            System.out.println("Object state stored using Serialization in file: ObjWithDeSerialization.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }


//      De De-Serialization
        try {
            FileInputStream fileInput = new FileInputStream("ObjWithDeSerialization.txt");
            ObjectInputStream in = new ObjectInputStream(fileInput);
            uds = (UsingDe_Serialization) in.readObject(); // object De_serialized an object is obtained

            System.out.println("Name: "+ uds.name);
            System.out.println("Name: "+ uds.age);
            System.out.println("Name: "+ uds.password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
