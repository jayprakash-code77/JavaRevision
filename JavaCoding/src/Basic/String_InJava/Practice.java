package Basic.String_InJava;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


        /*
        // Print each character of the String
        String name = "Jayprakash";
        char[] c = name.toCharArray();
        for(char element: c) {
            System.out.println(element);
        }

         */

        /*
        String name = "Jayprakash";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

         */




        /*
        // Count length without using length
        String name = "Jayprakash";
        char[] c = name.toCharArray();
        System.out.println(c.length);

         */




        /*
        // Count vowels in a String
        String name = "Jayprakash";
        int count = 0;
        char[] op = {'a', 'e'};
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);

         */




        /*
        // Reverse a String
        String name = "Jayp";
        int p1 = 0;
        int p2 = name.length()-1;
        char[] charArray = name.toCharArray();
        while(p1 < p2) {
            char temp = charArray[p1];
            charArray[p1] = charArray[p2];
            charArray[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(charArray));

         */






        /*
//        Check if the string is Palindrome
        String str = "mommy";
        int p1 = 0;
        int p2 = str.length() - 1;

        char[] cArray = str.toCharArray();
        boolean isPalin = true;
        while (p1 < p2) {
            if (cArray[p1] != cArray[p2]) {
                isPalin = false;
                break;
            }
            p1++;
            p2--;
        }
        System.out.println(isPalin);

         */





//        Count consonants in a string
        /*
        String name = "akaeioush";
        int count = 0;
        for(int i=0; i<name.length(); i++) {
            char c = name.charAt(i);
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        System.out.println(count);

         */


        /*
        String name = "Jayprakash";
        int count = 0;
        for(int i=0; i<name.length(); i++) {
            char c = name.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                name = name.replace(c, ' ');
            }
        }
        System.out.println(name.replace(" ", "").length());

         */










//         Convert string to uppercase without using method
        /*
        String name = "jayprakashmaurya";
        char[] charArray = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            charArray[i] = (char) (charArray[i] - 32);
        }
        System.out.println(charArray);

         */









//        Find frequency of a character
        /*
        char charValue = 'a';
        String name = "Jayprakash Maurya";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == charValue) {
                count++;
            }
        }
        System.out.println(count);

         */




//        Remove all spaces from string
        /*
        String name = "Jayprakash Maurya";
        System.out.println(name.replace(" ", ""));

         */







        /*
//        Check if string contains only digits
        String name = "03";
        boolean allInteger = true;
        for(int i = 0; i<name.length(); i++) {
            char c = name.charAt(i);
            int charValue = c+0;
            if(!(charValue >=  48 && charValue <= 57)) {
                allInteger = false;
                break;
            }
        }
        System.out.println(allInteger);

         */












//        Count words in a sentence
        /*
        String sen = "I am working on my idea. I have the company having the networth of 7 trillion dollars";
        String[] arr = sen.split(" ");
        System.out.println(arr.length);

         */












//



















    }
}