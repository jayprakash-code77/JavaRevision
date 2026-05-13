package Basic.Conditionals;

public class ModernSwitch {
    public static void main(String[] args) {
        /*
        // normal switch
        int day = 2;
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Date");

        }

         */




        //Fall Through : switch without break.
        /*
        int day = 2;
        switch(day){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            default:
                System.out.println("Invalid Date");
        }

         */






        /*
        // Modern Switch
        int noOfStudent = 10;
        switch(noOfStudent) {
            case 10 -> System.out.println("Less Student");
            case 40 -> System.out.println("Half of students are present.");
            default -> System.out.println("No student present.");
        }

         */







        /*
        // switch expression: switch that returns some value
        int day = 2;
        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
        System.out.println(result);

         */










    }
}
