package MediumJava;



// Constructors: Methods that does not have return type and they are called automatically when
//              when the object. If there is no define constructors, the default constructor will be created at runtime.




class Student {

//    String name = "Raju";
//    int age = 12;


    String name;
    int age;

    //    We use constructors to initialize class variables.
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructors {

    public static void main(String args[]) {
//        System.out.println("I am Jayprakash Maurya");
        Student s1 = new Student("Raju", 19);
        s1.display();

        Student s2 = new Student("Kiran", 23);
        s2.display();



//        Student s2 = new Student();
//        s2.name = "Kiran";
////        s2.age = 23;
//        s2.display();

    }
}

