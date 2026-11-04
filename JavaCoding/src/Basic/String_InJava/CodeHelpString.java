package Basic.String_InJava;

import java.util.Arrays;
import java.util.Scanner;

public class CodeHelpString {
    public static void main(String[] args) {


        // _____________________Comparing Strings_______________________
        /*
        String a = "Jay";
        String b = "Jay";
        String c = new String("Jay");

//        1. == : Compares the reference(address), not the actual content.
        System.out.println(a == b); // Ture: False: store in pool. Reference same object.
        System.out.println(b == c); // store in heap. Complete new Object.

//        2. .equals() : Compares the actual content
        System.out.println(a.equals(b)); // Ture: compares actual content
        System.out.println(b.equals(c)); // Ture: Object is different, but the content is same.


//        3. equalsIgnoreCase(): In ignores the Cases(Uppercase and Lowercase treated as same)
        String x = "Karjat";
        String y = "KARJAT";
        System.out.println(x.equalsIgnoreCase(y)); // Ture: It ignores the case sensitivity.


         */


//        ____________________Input String__________________

        /*
//        1. .nextt(); : It take only word as input. After seeing any space, it stops taking input.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name = scan.next(); // Example input: I am japrakash Maurya
        System.out.println("");
        System.out.println(name); // Print only first word in the input and after a single space nothing is considered as inout.


        // consume the left over in input buffer
        scan.nextLine();
        // OR use the scan.nextLine();



//        2. .nextLine() : It takes the whole sentence as input.
        System.out.print("Enter your surname: ");
        String sname = scan.nextLine();
        System.out.println(sname);


         */





        //        _____________________String: .intern() method______________________
        /*
        String name = "Jay";
        String ref = name.intern();
        System.out.println(ref);

         */







        //        _____________________Compile Time String Creation______________________

//        1. Trigger: A string literal such as "Java" is the key trigger. A final variable with a compile-time constant value can also be used.
//        2. Action: The compiler can evaluate the concatenation before the program runs.
//        3. Memory: The resulting string is represented in the class file’s constant pool and is associated with the JVM’s string pool when the class is loaded.

        /*
        String n1 = "Jayprakash";
        String n2 = new String("Jayprakash");
        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);

         */











        //        _____________________Runtime Time String Creation______________________
//        1. Trigger: A runtime value, a variable, or the new keyword can cause runtime string creation.
//        2. Action: The JVM evaluates the expression during execution. This creates a new String object, even if "Java" already exists in the string pool.
//        3. Memory: The String object is created on the heap. The string pool is also managed by the JVM, and pooled strings are associated with heap memory in modern Java implementations.

        /*
        String name = "Jay";
        String n2 = name + " Maurya";

        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true

         */









//        _____________________Common String Methods______________________
        /*
        String name = "Jayprakash Maurya";
        // 1. .length()
        System.out.println(name.length());

        // 2. .charAt()
        System.out.println(name.charAt(3));

        // 3. .substring()
        System.out.println(name.substring(0, 10));// End index is excluded

        // 4. .conntains()
        System.out.println(name.contains("jay"));

        // 5. .trim()
        System.out.println(name.trim());

        // 6. .split(String regex)
        String[] ans = name.split(" ");
        System.out.println(Arrays.toString(ans));

        // 7. .startsWith(String prefix)
        System.out.println(name.startsWith("J"));

        // 8. .endsWith(String suffix)
        System.out.println(name.endsWith("a"));

        // 9. .valueOf(any type)
        int age = 24;
        String s = String.valueOf(age);
        System.out.println(s);

        //10.  .otCharArray()
        char[] charArray = name.toCharArray();
        System.out.println(Arrays.toString(charArray));

        // 11. .isEmpty() : space is also treated as char so even if you have space in string it will say "false" if .isEmpty() is called
        String s1 = "";
        boolean as = s1.isEmpty();
        System.out.println(as);

        // 12. .isBlank() :  even if you string contains it will be considered Blank, till it does not contain any char.
        String s2 = " ";
        System.out.println(s2.isBlank());

        // 13. .replace(char oldChar, char newChar) :
        System.out.println(name.replace("a", "A"));

         */













    }
}