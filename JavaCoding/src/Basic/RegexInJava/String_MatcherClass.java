package Basic.RegexInJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_MatcherClass {

    public static void main(String args[]) {

//        Basic Regex code
        /*
        String name = "Jay Prakash Maurya";
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(name);
        System.out.println(m.matches());
        System.out.println(m.find());

         */




//      Main MMatcher Class Study

        Pattern p = Pattern.compile("geeks");
        Matcher m = p.matcher("geeksforgeeks.org");

//        1.
//        m.find() moves in sting like the pointer one by one if it finds something, it returns true and the loop runs.
        System.out.println("____________m.find()____________");
        while (m.find()) {
            System.out.println(m.start() + " " + m.end());
        }












//        2. start() and end() — INDEX CONTROL: it is used to control the index of the the find() method.
        System.out.println("____________start() and end()____________");
//        String input
        String input = "Order ID:1234 Status:Shipped StatusCode:2000";
//        Pattern
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher match = pattern.matcher(input);

        while (match.find()) {
            int start = match.start();
            int end = match.end();

            System.out.println("Start index :"+ start);
            System.out.println("End index :"+end);

            String matchedString = input.substring(start, end);
            System.out.println("String Matched : "+matchedString+"\n \n \n");


//          Matcher keeps:
//              Input sequence
//              Current search index
//              Last match boundaries
//          this is why m.find(); m.find(); continues from last position.
///         this will reset the last position and set it back to 0(from start).

//            _________________________IMPORTANT________________________
//            match.reset(); // in this example, this line will create the infinite loop
        }






//        3. group() — WHAT matched
        System.out.println("____________group() — WHAT matched____________");

        String input1 = "geeks ge";
        Pattern p1 = Pattern.compile("(ge)(eks)");
        Matcher m1 = p1.matcher(input1);
//        a. m.group()
        while (m1.find()) {
            System.out.println(m1.group()); // this uses the whole group together and matches
            System.out.println(m1.group(1)); // matches only group 1
            System.out.println(m1.group(2)); // matches only group 2
//          counting the number of groups
            System.out.println("Group count :"+m1.groupCount()+"\n \n");
        }



//      4. matches() — VALIDATION MODE
        System.out.println("____________matches() — VALIDATION MODE____________");
        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher("123");
        System.out.println(m2.matches()); // this matches the whole string, if the whole string does not match, it return false otherwise true.





//







    }
}
