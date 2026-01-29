package MediumJava;

class LabDemo {
    // attributes
    static String labName = "7X Lab";
    int labID;

    // static method
    String getLabName() {
        return labName;
    }

    static int getLabID(){
//        return labID;// this will create error
        return 0;
    }

}

public class TypesOfMethodsInJava {
    public static void main(String[] args) {
        //    accessing static and non static
        LabDemo ld = new LabDemo();
        String labName = ld.getLabName();
        System.out.println(labName);
    }


}
