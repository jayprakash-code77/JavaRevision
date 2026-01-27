package MediumJava;

//Static Method Cannot Access Instance Variables

class Lib {
    static String libName;
    String adminName;

    static void printInfo() {
        System.out.println("Lib Name :"+libName);
//        System.out.println("Lib Admin Name :"+adminName);  // this will create an Error: Non-static field 'adminName' cannot be referenced from a static context
    }
}


//Static Methods Accessed from Both Static and Non-Static Methods

class DemoStatic {
    static int num = 100;
    static String str = "GeeksForGeeks";

    static void displayInfo() {
        System.out.println("Str :"+str+", Num :"+num);
    }

    void callDisplay() {
        displayInfo();
    }
}




public class typesOfMethods {
    public static void main(String[] args) {
        //Static Method Cannot Access Instance Variables
        Lib lb = new Lib();
        System.out.println(lb.adminName);

        //Static Methods Accessed from Both Static and Non-Static Methods
        DemoStatic ds = new DemoStatic();
        ds.callDisplay();
    }
}
