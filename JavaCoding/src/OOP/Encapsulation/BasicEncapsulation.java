package OOP.Encapsulation;

class Encapsulate {
    private String name;
    private int age;

    private int accessToken = 77332211;


    String getName(int accessToken) {
        if(this.accessToken != accessToken) {
            throw new IllegalArgumentException("Invalid Token");
        }
        return this.name;
    }

    int getAge(int accessToken) {
        if(this.accessToken != accessToken) {
            throw new IllegalArgumentException("Invalid Token");
        }
        return age;
    }
}
public class BasicEncapsulation {
    public static void main(String args[]) {
        Encapsulate e =new Encapsulate();
        System.out.println(e.getAge(77332211));
    }
}
