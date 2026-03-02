package Basic.ArraysInJava.ArraysQuestions;
 import Basic.ArraysInJava.ArraysQuestions.Arrays01Q100Basic;

 import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {
        Arrays01Q100Basic a = new Arrays01Q100Basic();

//        Find Duplicate using MVIAN: Marking Visited Index As Negative
        int[] arr = {2, 3, 1, 2, 3};
        String res = a.findDuplicates_MVIAN(arr).toString();
        System.out.println("Duplicate using MVIAN: "+res);

//        Find Duplicate using HashSet
        int[] arr1 = {2, 3, 1, 2, 3};
        String res1 = a.findDuplicates_HashSet(arr1).toString();
        System.out.println("Duplicate using HashSet: "+res1);


//       Find number with even digits
        int[] arr2 = {12,345,2,6,7896};
        System.out.println(a.findNumbers(arr1));


//       Find pairs that sum up to K
        int arr3[] = {1,2,3,4,5,6,7};
        int K = 9;
        ArrayList<int[]> result = a.pairSumOfArray(arr3, K);
        for(int element[]: result) {
            System.out.println("Pair: "+element[0]+", "+element[1]);
        }

    }
}
