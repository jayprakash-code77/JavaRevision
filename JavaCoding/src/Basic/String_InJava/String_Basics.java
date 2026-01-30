package Basic.String_InJava;

public class String_Basics {


    public static void main(String[] args) {

        /*
//        Ways of creating the String
//        1. String literal (Static Memory)
        String name = "Prakash"; // this will be stored in the string pool. To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).
        System.out.println(name);


//        2. Using new keyword (Heap Memory)
        String str = new String("Maurya"); // This will create a new object in Heap Memory and it will store the literal will be stored in the String pool. In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool).
        System.out.println(str);

         */













//        Interfaces and Classes in Strings in Java : CharSequence Interface

        /*
//        1. String
        String name = new String("Jay");
        String n = name.concat(" Maurya");
        System.out.println("name = "+name+",     n = "+n);

//        2. StringBuffer
        StringBuffer sb = new StringBuffer("I am the beast who is undefeatable.");
        System.out.println(sb);

//        3. StringBuilder
        StringBuilder sbuild = new StringBuilder("Maurya");
        System.out.println(sbuild);

//        Immutable String in Java
        String cricketGod = "Sachin";
        cricketGod.concat("Tendulkar");
        System.out.println(cricketGod);


//        4. StringTokenizer
        StringTokenizer st = new StringTokenizer("Java String Example");
        System.out.println(st);

         */





//  Creating the String using the ascii values
        byte[] ascii = {83, 65, 66};
        String str = new String(ascii);
        System.out.println(str);


//        Creating the string using character array
        char[] ch = {'J', 'A', 'Y'};
        String naam = new String(ch);
        System.out.println(naam);




    }
}
