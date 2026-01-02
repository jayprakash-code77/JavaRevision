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

public class AccessModifiers {
    public String name = "7X";
    String email = "sevenX@gmail.com";
    private String password = "jayPrakash";
    protected String ownerName = "Jaypraksh";
}
