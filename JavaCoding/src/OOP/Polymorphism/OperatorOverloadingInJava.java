package OOP.Polymorphism;

import java.util.*;
class OperatorOverloadingInJavaDemo {
    int add(int a, int b) {
        return a+b;
    }

    String add(String a, String b) {
        return a+b;
    }
}
class OperatorOverloadingInJava {
    public static void main(String args[]) {
        OperatorOverloadingInJavaDemo ool = new OperatorOverloadingInJavaDemo();
        System.out.println(ool.add(3,2));
        System.out.println(ool.add("Jay","Maurya"));
    }
}
