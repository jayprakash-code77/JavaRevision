package MediumJava;

//Constructor chaining within same class.
class College {
    //    C1
    College() {
        this(2,4);
        System.out.println("I am C1");
    }
    // C2
    College(int a, int b) {
        this("Jay");
        System.out.println("I am C2");
    }

    //    C3
    College(String name) {
        System.out.println("I am C3");
    }

}





//Constructor chaining using base class. (Using the inheritance)
class Nursery {
    String name;
    int ID;
    Nursery(String name, int ID) {
        this.ID = ID;
        this.name = name;
        System.out.println("Base class");
    }
    Nursery() {
        this("jay", 3);
        System.out.println("Default constructor of Nursery");
    }
}
class Plants extends Nursery {
    Plants(String name, int ID) {
        super(name, ID);
        System.out.println("Plants classjfhjkh");
    }
    Plants() {
//        Here if I don't insert: super();    then
//        Java will add it automatically and it will call
//        the parent of this class
        super();
        System.out.println("Plants Class");
    }
}
class Flower extends Plants {

    Flower() {
        super();
        System.out.println("Flower class");
    }
}



public class ChainingOfConstructor {
    public static void main(String args[]) {
////        Constructor chaining within class
//        College c = new College();


//        Constructor chaining using the base class (super() keyword).
        Flower f = new Flower();
    }

}