package OOP.Encapsulation;

class Encapsulate {
    private String name;
    private int age;


    String getName() {
        return this.name;
    }

    int getAge() {
        return age;
    }
}
public class BasicEncapsulation {
    public static void main(String args[]) {
        Encapsulate e =new Encapsulate();
        System.out.println(e.getAge());
    }
}
