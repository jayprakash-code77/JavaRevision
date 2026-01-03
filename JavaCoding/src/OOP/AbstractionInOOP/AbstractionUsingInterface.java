package OOP.AbstractionInOOP;
// FIX
interface Car {
    public int numOfWheels = 4;  //Every variables defined in the interface
                                // are public static final by default.

    void getCarDetails(int numOfWheels, String modelNumber);
    int getNumOfWheels();
    String getModelNumber();
}

class Bugatti implements Car {

    String modelNumber;

    Bugatti(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void getCarDetails(int numOfWheels, String modelNumber) {

    }
}

// BUG
public class AbstractionUsingInterface {
    public static void main(String args[]) {
        Bugatti b = new Bugatti( "BUCHI123022");

        System.out.println(Car.numOfWheels); // public static final variable of interface
        System.out.println(b.getModelNumber()); // static variable
        System.out.println(b.getNumOfWheels());

    }
}
