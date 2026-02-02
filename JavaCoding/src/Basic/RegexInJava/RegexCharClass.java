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
        System.out.println("_____________________[a-zA-Z] : Range___________________");
        Pattern p2 = Pattern.compile("[0-9]");
        Matcher m2 = p2.matcher("nNcfKdlsdfsa673dfHkdfLhY");
        while (m2.find()) {
             m2.group(); //returns the text found
             m2.start(); //and m2.end() give you the indices
            System.out.println("Found: " + m2.group() + " at index " + m2.start()+" which ends at index :"+m2.end());
        }







//      [a-f[m-t]] : Union, which means => (a-f) OR (m-t)
        System.out.println("_____________________[a-f[m-t]] : Union __________________");
        Pattern p3 = Pattern.compile("[a-d[u-z]]");
        Matcher m3 = p3.matcher("itneczxcrexzgfriqitoqy");
        while(m3.find()){
            System.out.println(m3.group());
        }





//      [a-z && [^m-p]]: Intersection, which means   => a–z minus m–p
        System.out.println("_____________________a-z && [^m-p]] : Intersection __________________");
        Pattern p4 = Pattern.compile("[a-z && [^m-p]]");
        Matcher m4 = p4.matcher("rqeturewfdjsalhfvzv...vzvfjahfahfoqre");
        while (m4.find()) {
            System.out.println(m4.group());
        }





    }
}
