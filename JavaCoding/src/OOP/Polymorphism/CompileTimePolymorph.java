package OOP.Polymorphism;

import java.util.*;
class ComplileTimePolymorphImp {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }
}
class ComplileTimePolymorph {
    public static void main(String args[]) {
        ComplileTimePolymorphImp ct = new ComplileTimePolymorphImp();
        System.out.println(ct.sum(2,4));
        System.out.println(ct.sum(2.3f,4.5f));
    }
}
