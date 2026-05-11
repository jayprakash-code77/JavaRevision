package Basic.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 23;
        boolean eligible = (age >= 18) ? true : false;
        System.out.println(eligible);



        int a =34;
        int b =23;
        int bigNum = (a > b)? a:b;
        System.out.println(bigNum);

        int j = 4;
        boolean isOdd = (j % 2 == 0)? false:true;
        System.out.println(isOdd);





        // Can ternary operator return different data types?
        Object result = (a > 5) ? "Hello" : 100;
        System.out.println(result);



        //
        System.out.println((4 < 5)? true: false);







        //
        var res = (a < 5) ? "Hello" : 100;
        System.out.println(res);
    }
}
