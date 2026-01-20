package Basic;

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
        int a = 5;
        System.out.println("a initially :"+a);
        int b = a++; // b = 5, a = 6
        System.out.println("b = a++. Initially :"+a);
        int c = ++a; // a = 7, c = 7

        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);







    }
}
