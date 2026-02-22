package Basic.ArraysInJava.ArraysQuestions;
 import Basic.ArraysInJava.ArraysQuestions.Arrays01Q100Basic;
public class EntryPoint {
    public static void main(String[] args) {
        Arrays01Q100Basic a = new Arrays01Q100Basic();
        int[] arr = {2, 3, 1, 2, 3};
        String res = a.findDuplicates(arr).toString();
        System.out.println(res);
    }
}
