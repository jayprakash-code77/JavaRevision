package Basic;
import java.lang.Math;
import java.util.Scanner;
public class Lecture1 {
    public static void main(String []args) {

//        add two numbers
        /*
        int n1 = 23;
        int n2 = 34;
        System.out.println("Sum of two numbers is :"+n1+n2);
        System.out.println("Sum of two numbers is :"+ (n1+n2));
        */


//        Average of three numbers
        /*
        int n1 = 2,n2=3,n3 = 6;
        int avg = (n1+n2+n3)/3 ;
        System.out.println(avg);
         */



//        check number
        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) {
            System.out.print(-1);
        }else if (num > 0){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

         */

//largest of three
        /*
        int a = 3;
        int b = 8;
        int c = 12;

        if(a > b && a > c) {
            System.out.print("a is the greater");
        }else if (b > a && b > c) {
            System.out.print("b is the greater");
        }else{
            System.out.print("c is the greater");
        }

         */



//        valid triangle
        /*
        int s1 = 2;
        int s2 = 17;
        int s3 = 3;
        if(s1+s2 > s3 && s2+s3 > s1 && s1+s3 > s2) {
            System.out.print("Valid Triangle");
        }else{
            System.out.print("Not a valid triangle");
        }
         */


//      print 1 to N
        /*
        int n = 3;
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }

         */



//        factorial

        /*
        int n = 5;
        int facto = 1;
        for(int i=1; i<=n; i++){
            facto *= i;
        }
        System.out.println("Factorial of "+n+" is "+facto);

         */





//        check if the number is prime
/*
        int n = 15;
        boolean isPri = true;
        if(n <= 1) {
            isPri = false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(i % n == 0) {
                    isPri = false;
                    break;
                }
            }

        }
        if(isPri) {
            System.out.print(n+" is a prime number.");
        } else {
            System.out.print(n+" is not a prime number.");
        }

 */




        /*
        Problem statement
You are given a single positive integer, N. You need to print all even integers that occur between 1 and N (both inclusive).

Draw a flowchart for this process

Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.

         */

        /*
        int n=20;
        for(int i =1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.print(i+" ");
            }
        }
         */





//        largest of N numbers
        /*
        int[] num = {1, 23, 45, 6, 23, 11, 2};
        int largest = num[0];
        for(int i=1; i<num.length; i++) {
            if(num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.print("Largest number is "+largest);

         */


//        N factorial
        /*
        int n =  5;
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.print(fact);

         */



//        GCD

/*
        int num1 = 48;
        int num2 = 18;

        int small = 0;
        small = (num2 > num1)? num1 : num2;
//        small = Math.min(num1, num2);

        int gcd = 1;
        for(int i=1; i<=small; i++) {
            if(num2%i == 0 && num1%i ==0) {
                gcd = i;
            }
        }
        System.out.println(gcd);

 */




//        Using Euclidean Algorithm (Iterative) for GCD

        /*
        int ans = Lecture1.EuclideanAlgo(4, 12);
        System.out.println(ans);
        int ansRecursive = recursiveGCDEuclidean(4, 12);
        System.out.println(ansRecursive);

         */



//       Operator Precedence and Associativity in java.
        int q1 = 2 + 3 * 4; // ans = 14
        System.out.print(q1);

        int q2 = (2 + 3) * 4;
        System.out.println(q2);

        int q3 = 10 - 5 + 3;
        System.out.println(q3);

        int q4 = 10 / 5 * 2;
        System.out.println(q4);

        int q5 = 10 + 5 % 3;
        System.out.println(q5);

        int q6 = 2 * 3 + 4 * 5;
        System.out.println(q6);

        boolean q7 = 5 > 3 && 4 < 2;
        System.out.println(q7);

        int q8 = 8 >> 1 + 1;
        System.out.println(q8);

        int q9 = (8 >> 1) + 1;
        System.out.println(q9);


































    }

    public static int EuclideanAlgo(int a, int b) {
        while(a != 0) {
            int temp = a;
            a = a % b;
            b = temp;
        }
        return b;
    }

    public static int recursiveGCDEuclidean(int a, int b) {
        if(b == 0) return a;
        return recursiveGCDEuclidean(b, a%b);
    }
}


