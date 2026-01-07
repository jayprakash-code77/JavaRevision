package OOP.Inheritance;
class Devices {
    String type;
    String brandName;
    double price;

    Devices(double price, String brandName, String type) {
        this.brandName = brandName;
        this.type = type;
        this.price = price;
    }


    int getPrice() {
        return (int)this.price;
    }
}

class Mobile extends Devices {

    Mobile(double price, String brandName, String type) {
        super(price, brandName, type);
    }
    String getBrand() {
        return this.brandName;
    }
}

public class BasicInheritance {
    public static void main(String args[]) {
        Mobile m = new Mobile(20000, "RealMe", "Mobile");
        System.out.println(m.getBrand());
    }
}
