package OOP.AbstractionInOOP;

abstract class DemoAbsClass {
    int age;
    abstract void getAge();

    void display(){
        System.out.println("Age is: "+age);
    };

    DemoAbsClass(int age) {
        this.age = age;
        System.out.println("Constructor of DemoAbsClass is called.");
    }
}

class Demo extends DemoAbsClass {
    Demo(int age) {
        super(age);
    }
    @Override
    void getAge() {
        System.out.println("In Demo, Age is :"+age);
    }
}
public class AbstractClassesInJava {
    public static void main(String args[]) {
        Demo d = new Demo(22);
        d.getAge();
        System.out.println(d.age);
        d.display();
    }
}
