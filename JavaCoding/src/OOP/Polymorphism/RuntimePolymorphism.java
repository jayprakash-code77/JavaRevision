package OOP.Polymorphism;

class Demo {
    void m1(){
        System.out.println("m1 of Demo class ");
    }
}

class Demo2  extends Demo {
    @Override
    void m1() {
        System.out.println("m1 of Demo2 ");
    }

    void check() {
        System.out.println("I am checking weather I can refer Demo, while created object of  Demo");
    }
}

class Demo3 extends Demo {
    @Override
    void m1() {
        System.out.println("m1 of Demo3 ");
    }
}
class RuntimePolymorphism {
    public static void main(String args[]) {
        Demo d = new Demo();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        Demo dRef;

        dRef = new Demo();
        dRef.m1();


        dRef = new Demo2();
        dRef.m1();
//        dRef.check(); // Error: Java checks method availability at compile time using the reference type, NOT the object type.

        if (dRef instanceof Demo2) {
            Demo2 d2Ref = (Demo2) dRef;
            d2Ref.check();   // ✅ Works
        }

        dRef = new Demo3();
        dRef.m1();
    }
}
