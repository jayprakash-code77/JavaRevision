package Basic.ArraysInJava;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysMastry {
    // properties
    public int id;
    public String className;




    // example of varargs: Variable Arguments
    public void inputMarks(int... marks){
        System.out.println( Arrays.toString(marks));
    }


    ArraysMastry(int id, String className) {
        this.id = id;
        this.className = className;
    }

    // overriding the "toString()" method of "Object(Root) class"
    @Override
    public String toString() {
        return "ArraysMastry{id=" + id + ", className='" + className + "'}";
    }


    public static void main(String[] args) {

        /*
        // creating an array
        int[] arr; // declaration
        arr = new int[5]; // initialization [0,0,0,0,0]

        // declaration and creation
        int[] age = new int[3];

        // direct initialization
        int[] marks = {23,24,20,28};

        System.out.println(arr.getClass());
        System.out.println(arr.length);

        int[] clo = marks.clone(); // clone array
        System.out.println(clo[0]);

         */



        /*
        // 'toString() method': For using this method on primitive arrays, we have to use "Arrays", an utility class.
        int[] marks = {23,24,20,28};
        String marksArrString = Arrays.toString(marks);
        System.out.println(marksArrString);


        ArraysMastry[] objectArray = new ArraysMastry[2];

        // creitng two test objects  of "ArraysMastry"
        ArraysMastry test1 = new ArraysMastry(1,"TestClass1");
        ArraysMastry test2 = new ArraysMastry(2, "TestClass2");

        objectArray[0] = test1;
        objectArray[1] = test2;


        String result = Arrays.toString(objectArray); // this will give the class name followed by a hashcode: [ArraysMastry@1540e19d, ArraysMastry@677327b6]
        System.out.println(result);

        // Note : To use "toString()" in object arrays, we have to "override" the "toString" method of root class: "Object".

         */












        // Arrays Utility Class
        /*
        // Arrays.sort();
        int[] arr = {1,3,5,3,20,3,0};
        Arrays.sort(arr); // it sorts the whole "Original" array. // sorted in descending order
        System.out.println(Arrays.toString(arr));

         */






        // Arrays.binarySearch()
        /*
        int target = 32;
        int[] arr = new int[5];
        arr[0] = 29;
        arr[1] = 87;
        arr[2] = 32;
        arr[3] = 0;
        arr[4] = 99;
        // finding target's index
        int index = Arrays.binarySearch(arr, 32);
        System.out.println("Found out "+target+" at index: "+index);

         */









        // Arrays.fill()
        /*
        int[] arr = new int[5];
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

         */








        // Arrays.copyOf(originalArray, length of original array or more than the length) : returns new array
        /*
        int[] arr = {23,44,65,34,93,30,46};
        int[] newArray = Arrays.copyOf(arr, arr.length + 5); // new array with 5 more elements
        System.out.println(Arrays.toString(newArray));

         */







        // Arrays.copyOfRange()
        /*
        int[] arr = {23, 76, 33, 89, 91};
        int[] newArray = Arrays.copyOfRange(arr, 0, 3);// "to" is always excluded
        System.out.println(Arrays.toString(newArray));

         */






        // Arrays.equals()
        /*
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        if(arr1 == arr2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

         */









        // Arrays.mismatch()
        /*
        int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {2,3,4,9,6,7};
        // finding the index of first mismatch element
        int result = Arrays.mismatch(arr1, arr2);
        System.out.println(result);

         */






        // Arrays.compare()
        /*
        int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {2,3,4,5,6,7};
        // compare element
        int ans = Arrays.compare(arr1, arr2); // returns: 0 -> if all are same, -1 -> if even one element is different
        System.out.println(ans);

         */









        // Anonymous Array: new int[]{1,2,3,4};
        /*
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

         */










        // Variable Arguments (Varargs): taking n number of inputs in methods which becomes an array
        /*
        ArraysMastry am = new ArraysMastry(1, "ArraysMastry");
        am.inputMarks(23,56,90,56,11,95,52);

         */












        // Multidimensional arrays
        /*
        int[][] mArr = new int[2][2];
        mArr[0][0] = 34;
        mArr[0][1] = 35;
        mArr[1][0] = 36;
        mArr[1][1] = 37;
        System.out.println(Arrays.deepToString(mArr));

         */



        // NullPointerException
        /*
        int[] arr = null; // arr -> pointing to null
        System.out.println(arr.length);

         */




        // NegativeArraySizeException: The NegativeArraySizeException is a runtime exception in Java that gets thrown if an application attempts to create an array with a negative size.
        /*
        int[] arr = new int[-5];  // runtime Exception

         */









        // Array Covariance
        /*
        Object[] arr = new String[5]; // Allowed but dangerous. And this allowed coz, all classes extends Object(root) class.
        arr[0] = 20; // this will give error at runtime

         */








        // Final Array Reference
        /*
        final int[] arr = {1,2,3,4,5};
        // changing the element of array is allowed
        arr[0] = 34;
        System.out.println(arr[0]);

        // Re-initialization is not allowed
        arr = new int[6]; // this will show an error: Final cannot be assigned.

         */









        // converting array to List: Important>>>>>>>>>
        /*
        int[] arr = new int[]{1,2,3,4,5};
        var list = Arrays.asList(arr);  // list becomes single element list: List<int[]>, but it should be : List<Integer>

        System.out.println(list.size());
        System.out.println(list.get(0)[0]);

         */








        // Streams with Arrays (java.util.stream): streams allow you to stop writing clunky for loops for basic operations (like filtering, transforming, or aggregating data) and instead use Functional Programming
        /*
        int[] arr = {1,2,3,4,5};
        // sum
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        // find max
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        // and many more.....

         */







        // Array Reflection




























    }
}
