package Basic.InputInJava;

import java.util.Scanner;

public class ScannerClassInputs {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        /*
        int age = sc.nextInt();
        System.out.println(age);

         */






        System.out.println("Hello! Please input your details: ");
        System.out.print("Enter age and name");

        int age = sc.nextInt();
        sc.nextLine(); // this will consume the newline character.
        String name = sc.nextLine();

        System.out.println("Name: "+name+", Age: "+age);




    }
}
