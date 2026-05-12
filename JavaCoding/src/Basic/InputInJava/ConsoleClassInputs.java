package Basic.InputInJava;

import java.io.Console;

public class ConsoleClassInputs {
    public static void main(String[] args) {
        Console console = System.console();

        if(console != null) {
            String name = console.readLine("Enter your name :");
            console.printf("Name: "+name);
        }else {
            System.out.println("No Console available. Run this in real terminal.");
        }
    }
}
