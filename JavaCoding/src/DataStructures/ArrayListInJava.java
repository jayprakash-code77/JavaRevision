package DataStructures;

//importing ArrayList
import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
//      Declaring ArrayList
        ArrayList<Integer> res;
//      Creating an ArrayList
        res = new ArrayList<>();

//      add(element) method
        res.add(2);
        res.add(5);
        res.add(9);
        res.add(45);
//      add(index, element): add element to specific index
        res.add(0, 3);

//      get(index): get element at a specific index
        System.out.println("get(): "+res.get(0));

//      set(index, element)
        res.set(2, 77);

//      remove(index)
        res.remove(0);

//      size()
        System.out.println(res.size());

//      contains()
        System.out.println(res.contains(3));

        System.out.println(res.toString());

//      clear()
        res.clear();


    }
}
