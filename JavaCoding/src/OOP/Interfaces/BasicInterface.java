package OOP.Interfaces;
interface Basic {
    //  public, static, final
    int count = 45;

    // public and abstract
    int getCount();


    default void printCount() {
        System.out.println("The count is :"+count);
    }

    static int printAndReturn() {
        System.out.println("Printed and returning :"+ count);
        return count;
    }

    private void callPrivate() {
        System.out.println("I am printed from Private method of Interface.");
    }
}



class Test implements Basic {
    @Override
    public int getCount() {
        return count;
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getCount());
        t.getCount();
        t.printCount();

//        t.printAndReturn(); // this will give error, because this method is static.
        Basic.printAndReturn();

//        Basic.callPrivate(); // this will give error because it private in Interface.

    }
}
