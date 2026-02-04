package Basic.RegexInJava;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexQuantifiersOrMetacharacters {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("2{2}");
        Matcher m = p.matcher("222");
        Matcher m1 = p.matcher("fkfsada22dfj5j2");

        while(m1.find()) {
            if(!m1.group().isEmpty()) {
                System.out.print("Found at index :"+m1.start()+" ");
                System.out.println(m1.group());
            }
        }

//      Checking what we get the result with matches() method
        System.out.println("Using matches() method, we get :"+m.matches());


        System.out.println("\n\n\n\n");





//        White and Non-White spaces
//        Pattern p3 = Pattern.compile("\\s");
        Pattern p3 = Pattern.compile("\\w+");
//        Pattern p3 = Pattern.compile("\\B+");

        Matcher m3 = p3.matcher("jlk   fskaj    sldasd   ");
        while (m3.find()) {
            System.out.println("Found at index :"+m3.start());
            System.out.println(m3.group());
        }

        System.out.println(m3.matches());
    }
}
