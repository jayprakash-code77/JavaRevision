package OOP.Polymorphism;



class A {

    void display() {
        System.out.println("Class A override method");
    }
}


class B extends A {
    @Override
    void display() {
        System.out.println("Class B override method");
    }

    void demoCheck() {
        System.out.println("demoCheck from B");
    }
}


class C extends A {
    @Override
    void display() {
        System.out.println("Class C ");
    }
}
public class UpcastingAndDowncasting {

    public static void main(String[] args) {
        A a = new B();
        a.display();

//        a.demoCheck(); // this will create Error: The solution is the down-casting
//        Syntax: Child ref = (Child) parentRef;  // Downcasting
        B b = (B) a;
        b.demoCheck();



//      Safe Downcasting (Best Practice)
        A a1 = new C();
        if( a1 instanceof B) {
            B b3 = (B) a1;
            b.display();
        }




    }
}


