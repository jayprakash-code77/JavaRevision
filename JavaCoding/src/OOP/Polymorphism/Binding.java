package OOP.Polymorphism;

// Static Binding
class StaticBinding {
//    Static methods cannot be overridden. //Hence always static binding
    static void DisplayInfo(String name, int age) {
        System.out.println("Name :"+ name+ ", Age :"+age);
    }

    void show(String name) {
        System.out.println("My name is :"+name);
    }

    void show(int age) {
        System.out.println("My age is: "+age);
    }
}











//Dynamic Binding
class DynamicBindingParent {
    void show() {
        System.out.println("DynamicBindingParent Show.");
    }
}
class DynamicBindingChild extends DynamicBindingParent{
    @Override
    void show() {
        System.out.println("DynamicBindingChild Show.");
    }
}


public class Binding {
    public static void main(String agrs[]){

//        System.out.println("Jay Prakash Maurya");

//        Static Binding
        /*
        StaticBinding sb = new StaticBinding();
        sb.show("Jayprakash");
        sb.show(22);
        StaticBinding.DisplayInfo("Kajal", 22);
         */






//        Dynamic Binding
        DynamicBindingParent dp = new DynamicBindingChild();
        dp.show();



//
    }
}
