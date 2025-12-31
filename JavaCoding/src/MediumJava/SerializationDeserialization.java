package MediumJava;
import java.io.*;
import java.io.Serializable;

//
class Lab implements Serializable {
    public String name;
    public int noOfTeams;
    String email;

    // Use 'transient' if you DON'T want a specific field to be saved (like a password)
    public transient String password;

    public Lab(String name, int noOfTeams, String email, String password) {
        this.email = email;
        this.name = name;
        this.noOfTeams = noOfTeams;
        this.password = password;
    }
}

public class SerializationDeserialization {
    public static void main(String args[] ) {


        /*
//        Serialization of Data into the file.ser
        Lab lab = new Lab("7X", 7, "jay@gmail.com", "xyz@code");
        String filename = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(lab);
            out.close();
            file.close();
            System.out.println("Object Serialization is done.");
        } catch (Exception e) {
            e.printStackTrace();
        }

         */






        /*
//        De-serialization of object
        String filename = "file.ser";
        Lab lab;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            lab = (Lab) in.readObject();
            System.out.println("Email: "+lab.email);
            System.out.println("Name: "+lab.name);
            System.out.println("Number of Teams: "+lab.noOfTeams);
            System.out.println("Password: "+lab.password);
        } catch (Exception e) {
            e.printStackTrace();
        }

         */




    }
}
