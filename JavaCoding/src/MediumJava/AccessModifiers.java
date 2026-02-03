package MediumJava;

import MediumJava.Nursery;

class TechLab {
    public String name = "7X";
    String email = "sevenX@gmail.com";
    private String password = "jayPrakash";
    protected String ownerName = "Jaypraksh";
}


class Demo extends TechLab {
    public void diplay() {
        System.out.println(email);
    }
}



//Overloading private methods
class OverLoadPrivate {
    String name = "Jayprakash ";
    int age = 23;

//    Private method
    private String formate() {
        return name +  "Maurya";
    }

    private String formate(int age) {
        return name+" Maurya " + Integer.toString(age);
    }


    String callFormate() {
        return formate();
    }

    String callFormate(int age) {
        return formate(age);
    }
}

public class AccessModifiers {
    public String name = "7X";
    String email = "sevenX@gmail.com";
    private String password = "jayPrakash";
    protected String ownerName = "Jaypraksh";


    public static void main(String[] args) {

        System.out.println("-------------------- Overloading private methods class ----------------------");
        OverLoadPrivate olp = new OverLoadPrivate();
        System.out.println(olp.callFormate());
        System.out.println(olp.callFormate(23));

        Nursery n = new Flower();
        n.name = "Lilly";

        System.out.println(n.name);

    }
}
