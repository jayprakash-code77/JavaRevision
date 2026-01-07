
//Note: that Java does not support multiple inheritances with classes.
//        In Java, we can achieve multiple inheritances only through Interfaces.


//🚀 Java 8+ Default Method Case (Important for Interviews)
//Interfaces can have default methods, which may cause conflict.

//NOTE: Multiple Inheritance with Classes gives Error in Java.



// Wrong code example
/*
package OOP.Inheritance;

interface Lab {
    private int show() {
        System.out.println("I am Lab interface.");
        return 100;
    }

    default int getKey(){
        show();
        return 7;
    }
}


class Dev implements Lab {
    @Override
    public int getKey(){
        return 5;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dev d = new Dev();
        d.getKey();
    }
}

 */






package OOP.Inheritance;

interface Lab {
    private int show() {
        System.out.println("I am Lab interface.");
        return 100;
    }

    static int getKey() {
//        show();
        return 7;
    }
}

class Dev implements Lab {
//    @Override
    static int getKey() {
        return 10;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dev d = new Dev();
        System.out.println(Lab.getKey());
        System.out.println(d.getKey());
    }
}








