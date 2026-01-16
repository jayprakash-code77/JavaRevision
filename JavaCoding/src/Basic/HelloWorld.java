package Basic;


//Example 1
/*
public class HelloWorld {
    public static void main(String test[]) {
        System.out.println("I am software Engineer at Google");
        System.out.println(test[0]);
        System.out.println(test[1]);
    }
}

 */



public class HelloWorld {
    public static void main(String[] args) {
        // 1. Static output
        System.out.println("Software Engineer at Google");

        // 2. Safety Check: Always check length before accessing args
        if (args.length >= 2) {
            System.out.println("Arg 0: " + args[0]);
            System.out.println("Arg 1: " + args[1]);
        } else {
            System.out.println("Error: Please " +
                    "provide at least 2 arguments.");
        }
    }
}


