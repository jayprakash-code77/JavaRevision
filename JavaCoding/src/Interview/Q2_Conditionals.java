package Interview;

import java.time.DayOfWeek;

class Q2_Conditionals {
    public static void main(String [] args) {
// What are the different types of conditional statements in Java?
// Ans =>       if, if-else, if-else-if

// Explain the if, if-else, and if-else-if ladder with examples.
        /*
        int a = 3;
        int b = 7;

        if(b > a) {
            System.out.println("Example of 'If'");
        }
        if(b > a) {
            System.out.println("I am If");
        }else {
            System.out.println("I am if-else");
        }
        if(a > 3) {
            System.out.println("if");
        } else if(b < 7) {
            System.out.println("else");
        } else {
            System.out.println("if else if");
        }

         */



// Can we use a switch statement without a default case?
        /*
        int age = 28;
        switch (age) {
            case 28:
                System.out.println(" 28");
                break;
            case 18:
                System.out.println(" 18");
                break;
            case 14:
                System.out.println(" 14");
                break;
            default:
                System.out.println(" not mentioned");
        }

         */


//        Can a switch statement work with a long or double data type?
        /*
        double n = 3.9;
        long n = 32;
        switch (n) {

        }

         */


//        Write a simple program to check if a number is even or odd using an if-else statement.
        /*
        int num = 22;
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

         */




//        Write a program to find the largest of three numbers.
        /*
        int n1 = 3;
        int n2 = 9;
        int n3 = 5;
        if(n1 > n2 && n1 > n3) {
            System.out.println(n1);
        }else if(n2 > n1 && n2 > n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

         */




//        What is the "dangling else problem" and how does Java avoid it?
        /*
        float f = 4;
        if(f == 4)
            if(f == 5)
                System.out.println("Inner if");
        else
            System.out.println("else");

         */

//        Explanation: Java resolves this ambiguity through a simple but effective rule: "The else clause is always associated with the nearest preceding if that doesn't already have an else."
//
        /*
        int x = 5;
        int y = 10;

        if (x > 0)
            if (y > 0)
                System.out.println("Both positive");
            else
                System.out.println("This belongs to the inner if");

         */



//        What are the new switch expressions introduced in Java 14? How are they different from traditional switch statements? (Mention -> arrow syntax, no fall-through, returning values, multiple case labels)

        /*
        String day = "y";
        switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> System.out.println("6am"); // NOTE: Multiple Case Labels (Comma-Separated)
            case "TUESDAY"  -> System.out.println("8am"); //NOTE: no fall-through AND arrow syntax
            case "WEDNESDAY", "THURSDAY" -> System.out.println("7am");
            case "SATURDAY" -> System.out.println("9am");
            default -> System.out.println("9am");
        }

        // NOTE: Switch as an Expression (Returns a Value)
        int age = 12;
        int ans = switch (age) {
            case 2, 4, 6, 8 -> 10;
            case 10, 12, 14, 16, 18, 20 -> 20;
            default -> 30;
        };
        System.out.println(ans);

         */


        // The yield Keyword for Code Blocks
        /*
        int a = 16;
        int yearOld = switch (a) {
            case 16, 17 -> 0;
            case 18 -> {
                System.out.println("Apply for voting card");
                yield 18;
            }
            case 19 -> 19;
            default -> 99;
        };
        System.out.println(yearOld);

         */







//        Can you use a null value in a switch statement? What happens? (NullPointerException)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        /*
        String name = null;
        switch(name) {
            case null -> System.out.println("Null");
            default ->System.out.println("efault");
        }

         */

        //
        /*
        String word = null;
        String result = switch (word) { // Throws NullPointerException here
            case null -> "It's null pointer exception firsttttttttt";
            case "hello" -> "Greeting found";
            default -> "No match";
        };
        System.out.println(result);

        switch (word) {
            case null : System.out.println("It's null pointer exception!");
            break;
            case "success": System.out.println("I got success!");
            break;
            default:System.out.println("Nothing!!!");
        }

         */





//        What is the difference between a nested if and an if-else-if ladder?
//        Ans =>An if-else-if ladder is used when you have a series of conditions that are mutually exclusive—meaning only one of them can be true at a time. The program checks each condition in order, and as soon as it finds one that is true, it executes the corresponding block and exits the entire ladder, skipping all subsequent checks.
//            =>A nested if is an if statement placed inside another if or else block. It is used when a second condition only matters if the first condition is true (or false). The conditions are dependent on each other.





//How would you rewrite a long if-else-if ladder? (Mention switch, polymorphism, or the Strategy pattern as advanced alternatives)
//
//        Ans=> Use a switch expression (Java 14+) for clarity and safety. For complex behavior, use polymorphism (different subclasses with overridden methods) or the Strategy pattern (encapsulating behaviors into interchangeable objects).





//Explain the concept of "fall-through" in a switch statement with an example. Is it ever useful?
//
//        Ans=> Fall-through means execution continues to the next case after the current one finishes, ignoring the next label. It's triggered by omitting break.
        /*
        String name = "jay";
        switch(name) {
            case "jay": System.out.println("Jay is going to message Maa, ");
            case "girl": System.out.println("Girl, ");
            break;
            default:System.out.println("No one!!");
        }

         */




//How do you compare two String objects in an if condition? Why can't you use ==? (.equals() vs. ==)
//
//        Ans=> We will use ".equals()" method to compare two strings. "==" compares the memory address
        /*
        Key Point: The == operator:
            For primitives (like int, char, double): compares their values.
            For objects (like String, ArrayList): compares their memory addresses (reference equality).

         */
        /*
        String str1 = "jay";
        String str2 = "jay";
        if(str1 == str2) {
            System.out.println("Strings are equal");
        }

        String str3 = new String("jay");
        String str4 = new String("jay");
        if(str3.equals(str4)) {
            System.out.println("Strings are equal");
        }

         */






//Write a program to check for a leap year using conditionals.
//
        /*
        int year = 2000;
        if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println("Leap year!!!");
        }

         */



//Given a condition if (flag), what are the possible values of flag for the block to execute?
//        The if block executes only if flag is true.
//        Follow-up: Unlike C/C++, Java's if requires a boolean (true or false). An integer (e.g., if (1)) is a compile-time error, preventing a common class of bugs.












//        <<<<<<<<<<<<<<<<<<<<<<<<<< Advanced & Tricky Questions >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//  What will this code print?
        /*
        boolean flag = false;
        if (flag = true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

         */




//   Is if (booleanVariable) better than if (booleanVariable == true)? Why? (Style and readability)
//        Answer: Yes, if (booleanVariable) is better. It is cleaner, more idiomatic, and avoids the potential bug of accidentally using the assignment operator = instead of ==.





//   How does the conditional operator ? : work? Provide an example. Can it replace every if-else?
        /*
        int a = 3;
        int b = 9;
        String ans = (a > b)? "It's True.":"It's False.";
        System.out.println(ans);

         */
//   Answer: It's a ternary operator: condition ? expression_if_true : expression_if_false. It cannot replace every if-else because it is an expression that must return a value, whereas an if-else is a statement used for controlling program flow.







//   How can you achieve pattern matching for instanceof (Java 16+)? How does it simplify conditionals?

        /*
        // Old way
        String obj = new String("Jay");
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }

        // New way with pattern matching
        if (obj instanceof String s) {
            System.out.println(s.length());
        }

         */
//   Answer: It simplifies the classic instanceof-and-cast pattern:
//        Example
        /*
        // 's' is in scope for the rest of the condition and the block
        if (obj instanceof String s && s.length() > 5) {
            System.out.println("Long string: " + s);
        }

         */











//        Discuss how you can use the Strategy Design Pattern to replace complex conditional logic.
//        Answer: The Strategy Pattern encapsulates each branch of complex conditionals (e.g., different algorithms or behaviors) into separate strategy classes. Instead of a large if-else or switch, you select and use the appropriate strategy object. This promotes cleaner, more maintainable, and extensible code (Open/Closed Principle).









//    What are the pitfalls of deep nested if statements?
//
//    Answer: They lead to:
//      Poor Readability: Often called "Arrowhead Anti-pattern," making code hard to follow.
//      High Cyclomatic Complexity: Makes code difficult to test and maintain.
//      Brittleness: A small change in logic can require restructuring many levels.









//   In a switch expression with ->, why is the break keyword not needed?
//
//    Answer: The arrow syntax -> was designed for no fall-through. The code to the right of the arrow executes for that case, and then control automatically jumps to the end of the switch without needing a break.







//        Can a case label be a complex expression or a method call?
//
//    Answer: No. A case label must be a constant expression (like a literal, final constant variable, or enum value). It cannot be a method call or a variable that could change at runtime.







//        How would you handle a condition that depends on an object that might be null?
//    Answer: Use short-circuiting logical operators to check for null first:
        /*
//        Example:
        // Safe check: if obj is null, the second part is not evaluated
        String obj = new String("jay");
        if (obj != null && obj.isValid()) {
            // Do something
        }

         */







//        Explain "conditional compilation" in Java. Is it possible?
//
//  Answer: Java doesn't have a preprocessor like C/C++. However, a limited form is achieved using static final boolean constants. The Java compiler is smart enough to omit code within if (false) { ... } blocks entirely, as the condition can never be true. This is often used for debugging flags.
        /*
//        Example
        public static final boolean DEBUG = false;

// This code and its contents will not be in the final bytecode
        if (DEBUG) {
            System.out.println("Debug log");
        }
         */






    }
}