package Basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperatorsInJava {
    public static void main(String args[]) {


        /**
         * Integer vs Floating Division
         * Note: If both Operands are Int, the answer will be int only.
         * If both operands are int, result is int.
         */

        /*
        int a = 5 / 2;      // 2
        double b = 5 / 2;  // 2.0 ❌
        double c = 5 / 2.0;// 2.5 ✅
        System.out.println(a +", "+b+", "+c);

        float ans = 12/5f;
        System.out.println(ans);
         */














//        Pre- And Post-Increment and Decrement
        /*
        int a = 5;
        System.out.println("a initially :"+a);
        int b = a++; // b = 5, a = 6
        System.out.println("b = a++. Initially :"+a);
        int c = ++a; // a = 7, c = 7

        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);

         */










//        Rounding-Off Errors Java

//        1. Never compare floating numbers using ==
        /*
        float a = 3.23f;
        float b = 0.1f + 0.2f;
        System.out.println(a == b);// this should be true, but it's showing false.

         */


//        Comparing two floating point numbers.
        /*
        double EPS = 1e-9; // 1e-9 = 0.000000001, I will treat them as equal. If the difference is smaller than 0.000000001
        boolean condition = Math.abs(a - b) < EPS;
        System.out.println(condition);
        if (condition) {
            // considered equal
            System.out.println("This is the perfect way to to compare two floating numbers");
        }

         */






//        BigDecimal Class: For the accuracy critical situations
        BigDecimal bd = new BigDecimal("0.2");
        BigDecimal bd2 = new BigDecimal("0.1");
        System.out.println(bd.add(bd2));

        BigDecimal x = new BigDecimal("2.345");
        BigDecimal ans = x.setScale(2, RoundingMode.HALF_UP);   // 2.35
        System.out.println(ans);

        BigDecimal ans2 = x.setScale(2, RoundingMode.DOWN);      // 2.34
        System.out.println(ans2);

        BigDecimal ans3 = x.setScale(2, RoundingMode.UP);        // 2.35
        System.out.println(ans3);


//        Accumulation Error in java
        double sum = 0;
        for(int i = 0; i < 1000; i++) {
            sum += 0.1;
        }
        System.out.println("Sum :"+sum); // 99.9999999999986 but it should be 100.0












    }
}
