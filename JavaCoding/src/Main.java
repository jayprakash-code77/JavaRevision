import MediumJava.*;


// this is to test the "Access Modifiers"
class Example extends AccessModifiers {
    void displayName() {
        System.out.println(name);
    }

    void displayOwnerName() {
        System.out.println(ownerName);
    }
}
public class Main {
    public static void main(String[] args) {
        Example e = new Example();
        e.displayName();
        e.displayOwnerName();
    }
}


