package Interview;

class Q_Operators {
    public static void main(String aegs[]) {
        // System.out.println("Checking!!");

        // Questions on Arithmetic Operator _____________________________________________________________________________________________

        // What will be the result of 10 / 3 and 10 % 3 in Java?
        /*
        int ans = 10/3;     // 10 divide by 3. Q=3, R=1
        int ans2 = 10%3;   // returns R
        System.out.println(ans);
        System.out.println(ans2);
        */


        // What is the difference between pre-increment (++a) and post-increment (a++) operators?
        /*
        int num = 3;
        int r1 = num++; // r1 =3a and then 'num = num+1' so "num = 4"
        int r2 = ++num; //
        System.out.println(r1);
        System.out.println(r2);
        */


        // What is the difference between pre-decrement (--a) and post-decrement (a--) operators?


        // What happens if you divide an integer by zero in Java?
        /*
        int n1 = 40;
        int result = n1 / 0;
        System.out.println(result);
        */


        // What is the result of dividing a floating-point number by zero in Java?
        // float fl = 3.4/0; // 3.4/0   "Any divided by 0, will give infinity"
        /*
        double dbl = 3.4/0;
        System.out.println(dbl);
        */


        // What is the result of dividing a floating-point number by zero in Java?
        // int n = 20/0;


        // How does Java handle negative numbers with % operator (e.g., -10 % 3)?
        /*
        int num = -10 % 3;
        System.out.println(num);
        */


        // What happens if you use arithmetic operators with char type variables in Java?
        /*
        char n = 'a'; // 97
        char m = 'b'; // 98
        int ans = n + m;
        System.out.println(ans);
        char res = n + m;
        */


        // Why does 10/3 give 3 and not 3.3333 in Java?
        // ans => To get 3.3333, at least one operand must be a floating type
        /*
        float res = 10/3;
        float f = 10/3.0f;
        System.out.println(res);
        System.out.println(f);
        */


        // How can you get a decimal result when dividing two integers in Java?
        // ans =>Cast one operand to double or float.
        /*
        float a = 5/3;
        System.out.println(a);
        float b = 5f/3;
        System.out.println(b);
        */


        // What is the output of the following code?
        /*
        int x = 5;
        System.out.println(x++ + ++x); // 5 + 7 = 12
        */


        // What is the result of:
        /*
        int a = 7, b = 2;
        System.out.println(a / b * b + a % b); // (7/2=3)*2 =>  6 + (7%2=1) => 6 + 1 = 7 finally
        */


        // What is the difference between x += y and x = x + y in Java (regarding type promotion)?
        /*
        byte b = 10;
        // b = b + 1; // Error: int cannot be assigned to byte
        b += 1;       // Works fine (implicit cast back to byte)
        */


        // Can arithmetic operators be applied to boolean values in Java?
        /*
        boolean res = false;
        No. Boolean in Java supports only logical operators (&&, ||, !).
        Expressions like true + false are invalid.
        */


        // What is the result of overflow in Java arithmetic (e.g., adding Integer.MAX_VALUE + 1)?
        /*
        int r = Integer.MAX_VALUE + 1;// + 1, will make the value negative, the max value will be converted to negative
        System.out.println(r);
        */


        // How does Java handle arithmetic operations with mixed data types (int + double, byte + short, etc.)?
        // Ans =>
        //     Smaller types (byte, short, char) are promoted to int.
        //     If different types are used, result is promoted to the wider type.
        // Examples:
        /*
        System.out.println(5 + 2.5);  // double (7.5)
        byte b1 = 10, b2 = 20;
        System.out.println(b1 + b2);  // int (30)
        */


        // What is operator precedence among arithmetic operators (*, /, %, +, -)?


        // Explain associativity of arithmetic operators in Java with an example.
        /*
        int ans = 3 % 3 * 7; // 0
        // int ans = 3 % 21; // 0
        System.out.println(ans);
        */


        // What is the difference between Math.floorDiv() and / operator in Java?
        // '/' operator truncates the result towards zero.
        // 'Math.floorDiv()' truncates towards negative infinity.
        // Examples:
        /*
        System.out.println(7 / 3);               // 2
        System.out.println(Math.floorDiv(7, 3)); // 2

        System.out.println(-7 / 3);               // -2 (towards 0)
        System.out.println(Math.floorDiv(-7, 3)); // -3 (towards -∞)
        */


        // Why does System.out.println(2.0/0); print Infinity instead of throwing an error?
        // Ans =>
        // In floating-point arithmetic (double/float), division by zero is defined by IEEE 754 standard.
        // Positive number / 0.0 → Infinity
        // Negative number / 0.0 → -Infinity
        // 👉 Unlike integers, floating-point division by zero does not throw ArithmeticException.


        // How does Java handle NaN (Not-a-Number) in arithmetic operations?
        // NaN arises from undefined operations (like 0.0 / 0.0).
        // Any operation involving NaN results in NaN.
        // Examples:
        /*
        System.out.println(0.0 / 0.0);     // NaN
        System.out.println(Math.sqrt(-1)); // NaN
        System.out.println(NaN + 5);       // NaN
        */


        // What is the result of 0.0 / 0.0 in Java?
        // Ans => NaN.
        // Because it’s mathematically undefined.
        // System.out.println(0.0 / 0.0); // NaN


        // Can arithmetic operators be overloaded in Java like in C++? Why or why not?
        // Ans =>
        // No, Java does not support operator overloading (except + for String concatenation).
        // This was a design choice to keep Java simple and avoid complexity/ambiguity.


        // What will be the result of the following code?
        /*
        byte b1 = 10, b2 = 20;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);
        */
        // b1 + b2 →both promoted to int before addition.
        // So result is 30 ( int).
        // Explicit cast back to byte →still 30.
        // Output: 30
        // If sum exceeds byte range (-128 to 127),it will overflow.


        // Explain the difference between arithmetic shift (>>, <<) and arithmetic operators like /, %.
        // >> and << are bitwise shift operators, not arithmetic.
        // / and % perform actual division and remainder
        // Example:
        /*
        System.out.println(10 / 2);   // 5
        System.out.println(10 >> 1);  // 5 (binary shift right = divide by 2)

        System.out.println(-10 / 2);  // -5
        System.out.println(-10 >> 1); // -5 (sign bit preserved)
        */
        // Shifts are faster but only approximate division when denominator is power of 2.


        // Why is % operator called the remainder operator and not modulus in Java?
        // Ans =>
        // Because Java’s % follows sign of dividend (left operand).
        // True modulus always returns a non-negative result.
        // Examples:
        /*
        System.out.println(-10 % 3); // -1 (remainder)
        System.out.println((( -10 % 3) + 3) % 3); // 2 (modulus equivalent)
        */


//        Questions on Relational Operators ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//        What are relational operators in Java?


//        What is the difference between = and == in Java ?
//            What does == compare when used with primitives vs objects?
//
//        What is the difference between == and.equals() in Java?
//
//        Why does "Java" == "Java" sometimes return true and sometimes false ?
//
//                What happens when you compare a char with an int?
//
//        Can relational operators be used with boolean values in Java?
//
//        What happens when you compare NaN with relational operators ?
//
//                Why does Double.NaN == Double.NaN return false ?
//
//                Can relational operators be used with wrapper classes like Integer or Double ?
//
//                What is the difference between relational operators and the compareTo() method ?
//
//                Why is == not recommended for comparing floating -point numbers ?
//
//                What happens when you compare different primitive types(e.g., int with double)?
//
//        Can relational operators be chained like in Python (a < b < c) ?
//
//                What’s the difference between ==in Java and in C / C++ ?
//
//                How does == behave with autoboxing and caching (Integer i1 = 128, i2 = 128;)?
//
//        Why does 0.1 + 0.2 == 0.3 return false in Java?
//
//        What is the output of "hello".equals(new String("hello")) vs "hello" == new String("hello") ?
//
//                Can relational operators be overloaded in Java?
//
//        What happens when you use == with null ?
//
//                What is the precedence of relational operators compared to arithmetic operators?
//
//        Can you compare objects of different types with relational operators?
    }
}