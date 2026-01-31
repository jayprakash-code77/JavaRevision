package Basic.RegexInJava;
import java.util.regex.*;

public class String_PatternClass {

    public static void main(String[] args) {

//       1. compile(String regex)
        Pattern p = Pattern.compile("\\d+"); // Converts a regex string into a Pattern object

        // Normal String
        String strCheck = "123hjd9fh5as";

//       2. matcher(CharSequence input)
        Matcher m = p.matcher(strCheck); // Creates a Matcher object
        System.out.println(m);

        System.out.println(m.find()); // this matches the string partially
        System.out.println(m.matches()); // this matches the full string



//      3. What it does: 1. Compiles regex, 2. Matches entire input, 3. Returns boolean
        boolean ans = p.matches("\\d",strCheck);  // matches(String regex, CharSequence input) (STATIC)
        System.out.println(ans);


//      4. split(CharSequence input) :
        String[] splitResult = p.split(strCheck);  //1. Splits string using regex, 2. Returns String[]
        for(String loopElement : splitResult) {
            System.out.println(loopElement);
        }





//        Regex Power in split()
        System.out.println("_________Pattern.split operations__________");
        Pattern splitPattern = Pattern.compile("\\s+");
        String sentence = "I am a billionaire";
        String[] stringWords = splitPattern.split(sentence);
        for(String w : stringWords) {
            System.out.println(w);
        }







    }
}
