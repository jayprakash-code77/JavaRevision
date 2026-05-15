package Practice;

public class LoopsPratice {
    public static void main(String[] args) {

        //counting from 1 to n
        /*
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

         */


        // n to 1 counting
        /*
        int n = 8;
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

         */






        // 10 multiple of n
        /*
        int n = 5;
        for(int i=1; i<=10; i++) {
            System.out.println(i*n);
        }

         */









        //  1 to 100 : even numbers
        /*
        for(int i=2; i<=100; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

         */













        // print sum of numbers from 1 to n
        /*
        int sum = 0;
        int n = 5;
        while(n >= 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);

         */







        // in the range [50, 100] : print perfectly divisible by 7
        /*
        for(int i=50; i<=100; i++) {
            if(i%7 == 0) {
                System.out.println(i);
            }
        }

         */








        // factorial of a number
        /*
        int num = 5;
        int fact = 1;
        while( num >= 1) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial: "+fact);

         */










        // reverse the number
        /*
        int num = 1245;
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(reverse);

         */







        // check palindrome number: 1st approach
        /*
        int num = 12421;
        int originalNum = num;
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if(reverse == originalNum) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

         */









        // count digits of a number
        /*
        int num = 435;
        int noOfDigits = 0;
        while (num > 0) {
            noOfDigits++;
            num = num / 10;
        }
        System.out.println("No. of digits: "+noOfDigits);

         */









        // sum of digits
        /*
        int num = 2234;
        int sumOfDigits = 0;
        while(num > 0) {
            sumOfDigits = sumOfDigits + num%10;
            num = num / 10;
        }
        System.out.println("Sum of digits: "+sumOfDigits);

         */








        // Fibonacci Series
        /*
        int limit = 10;
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1+"\n"+f2);
        while(limit -2 > 0) {
            int next = f1+f2;
            System.out.println(next);
            f1 = f2;
            f2 = next;

            limit--;
        }

         */











        // Prime Number
        /*
        int num = 23;
        boolean isPrime = true;
        for(int i=2; i<(num/2)+1; i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

         */

        // Prime number using the Mathematical Way
        /*
        int num = 23;
        boolean isPrime = true;
        for(int i=2; i*i <= num; i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

         */












        // table printing
        /*
        int num = 5;
        for(int i=1; i<=10; i++) {
            System.out.println(num+" x "+i+" = "+i*num);
        }

         */








        // print half pyramid
        /*
        int num = 5;
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */










        // print half inverted pyramid
        /*
        int num = 5;
        for(int i=0; i<num; i++){
            for(int j=1; j<=num-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */







    }
}
