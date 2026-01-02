package OOP.AbstractionInOOP;

abstract class Office {
    public String address;
    public String name;
    public int numOfEmp;

    abstract void displayDetails();
    abstract String getAddress();


//    constructor
    public Office(String address, String name, int numOfEmp) {
        this.name = name;
        this.numOfEmp = numOfEmp;
        this.address = address;

        System.out.println("Office Constructor was called");
    }
}

class Santacruz extends Office {

    String branchID;

    public Santacruz(String address, String name, int numOfEmp, String branchID) {
        super(address, name, numOfEmp);
        this.branchID = branchID;
    }

    @Override
    String getAddress() {
        return address;
    }

    @Override
    void displayDetails() {
        System.out.println(name);
        System.out.println(numOfEmp);
    }

    void displayBranchID() {
        System.out.println("Branch ID:"+branchID);
    }
}


public class AbstractionUsingClasses {
    public static void main(String args[]) {
//        Office s = new Santacruz("Santacruz", "7X",7, "SANT01");  // this will show error if I try to call "displayBranchID()" method.
        Santacruz s = new Santacruz("Santacruz",
                "7X",7, "SANT01");
        s.displayDetails();
        String address = s.getAddress();
        System.out.println("Address: "+address);
        s.displayBranchID();
    }
}
