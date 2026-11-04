package OOP;
import java.util.Objects;

class Address {
    String address ;
    Address(String address) {
        this.address = address;
    }
}

class Student {
    String name ;
    Address address ;
    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        String msg = "Name:"+this.name+" Address:"+this.address.address;
        return msg;
    }
}




public class DeepCopyShallowCopy {
    public static void main(String[ ] args) {
        // Shallow copy: Normal example. Interviewer rarely ask this. Interviewer don't consider thi
        /*
        Address address = new Address("Mumbai");
        Student s1 = new Student("Jay", address);
        System.out.println(s1);

        // Both object points to the same object in the heap.
        Student s2 = s1;
        System.out.println(s1 == s2);

        // modifying one will change the value of both
        s2.name = "Prakash";
        System.out.println(s1.name);

         */



        // Real Shallow Copy
        /*
        Address address = new Address("Mumbai");
        Student s1 = new Student("Jay", address);
        Student s2 = new Student(s1.name, s1.address);
        System.out.println(s1 == s2); // Outer object is different. It is created new created in the memory.
        System.out.println(s1.address == s2.address); // Internal Object is same. Both inner object (address objects of both s1 and s2) of s1 and s2 point to the same object.
        // Problem with shallow copy: If address of s1 is changed, s2's address will change.

         */

























        // ____________________Deep Copy_______________________









    }
}
