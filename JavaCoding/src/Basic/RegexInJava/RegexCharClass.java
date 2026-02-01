package Basic.RegexInJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharClass {

    public static void main(String args[]) {
//        REGEX CHARACTER CLASSES

//        1. [xyz]: Matches x, y, or z
        Pattern p = Pattern.compile("[xyz]+");
        Matcher m = p.matcher("xfj");
        System.out.println(m.matches());
        if (m.find()) {
            System.out.println("find() result: " + m.group()); // Prints: x
        }


//        2. [^xyz] (Negation)
        System.out.println("____________________[^xyz] (Negation)________________________");
        Pattern p1 = Pattern.compile("[^0-9]");
        Matcher m1 = p1.matcher("1d2j3f4");
        while (m1.find()) {
            int start = m1.start();
            int end = m1.end();
            System.out.println(start);
            System.out.println(end);
            System.out.println("[^xyz] (Negation) :"+m1.group());
        }



//        3. [a-zA-Z] : Range





    }
}
