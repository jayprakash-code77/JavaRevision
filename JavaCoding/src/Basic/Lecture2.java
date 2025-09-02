package Basic;

class Lecture2 {

    static String IamStatic = "Example of Static Variable.";

    public static void blockExample() {
        {
            String name = "Jayprakash Maurya";
            System.out.println("Block of Code."+name);
        }

        int name = 77;
        System.out.println("Name is "+name);
    };

    public static void main(String args[]) {
//        block example
        blockExample();

//        Naming Conventions in Java
        /*
        1. Class name starts with Capital Letter. : MySchool
        2. Method and variable names start with a lowercase letter and use camelCase like printMessage.
        3. Constants are written in all uppercase letters with underscores like MAX_SIZE.
         */


//        Variable in Java =.>>>>>>>>>>>>>>>>>>>>>>>>>>
//        example final
        final int aadhar;
        aadhar = 3453;
        System.out.println(aadhar);

//        example static variable
        Test t1 = new Test();
        System.out.println(Test.IamStatic);

//        local variable inside "ageReturn" function
        System.out.println(t1.ageReturn());





    }
}


class Test {
    static String IamStatic = "I am static example.";

    public void print() {

        System.out.println("I am local variable.");
    }

    public int ageReturn() {
        int age = 22;
        return age;
    }
}
