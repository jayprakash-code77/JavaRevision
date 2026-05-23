package Basic.ArraysInJava;

import java.util.Arrays;


class Student {
    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetail() {
        System.out.println("Name: "+this.name+", Age: "+this.age);
    }
}



public class ArrayExperiments {

    public static void main(String[] args) {

        /*
        double[] arr = new double[5];
        System.out.println(arr.getClass());
        System.out.println(arr instanceof Object);

         */








        //
        /*
        int[] a = new int[5];
        double[] b = new double[5];
        float[] c = new float[5];
        String[] d = new String[5];
        boolean[] e = new boolean[5];

        System.out.println(Arrays.toString(a)); //0
        System.out.println(Arrays.toString(b)); //0.0
        System.out.println(Arrays.toString(c)); //0.0
        System.out.println(Arrays.toString(d)); //null
        System.out.println(Arrays.toString(e)); //false

         */









        // Reference Copying
        /*
        float[] percent = new float[5];
        percent[0] = 45;
        float[] res = percent;
        System.out.println(res[0]);

         */








        // Shallow Copy: Copies reference
        /*
//        clone(): shallow copy for primitive  array and Deep copy for Object array
//        Arrays.copyOf(): shallow copy for primitive  array and Deep copy for Object array
//        System.arraycopy() : shallow copy for primitive  array and Deep copy for Object array
        // for primitives
        int[] a = {1,2,3};
        int[] b = a.clone(); // create new array. It does not only copy the reference, it creates new array.

        // for object types
        String[] s1 = {"Jay", "Kajal", "Sonam"};
        String[] s2 = s1.clone(); // IMPORTANT: this clone method copies reference ONLY. s1 -> [object] <- s2  : point to same object

         */






        // arrays are object
        /*
        int[] num = new int[5];
        System.out.println(num instanceof Object);
        System.out.println(num.getClass());

         */






        // reference sharing
        /*
        int[] num = {2,3,4,5,6};
        int[] newNum = num;
        System.out.println(newNum[4]);

         */





        // clone() Method: Shallow copy for object arrays
        /*
        String[] arr = {"JPack", "Maurya", "7XLab"};
        String[] newArray = arr.clone();
        arr[0] = "lol"; // modified the arr[0]; --> here we are actually creating a totally new String object and arr[0] starts to point to that object new object ["lol"]. But the still old object at arr[0] still exists, and the "newArray[0]" still point to that object.
        System.out.println("newArray[0]: "+newArray[0]); // JPack : the old object:

         */




        // clone() Method: Deep copy for primitive arrays
        /*
        int[] num = {1,2,3,4,5};
        int[] newNum = num.clone(); // this totally creates a new array object of primitive and copies the whole arrays with the VALUES inside it.
        num[0] = 8;
        System.out.println(newNum[0]); // 1
        System.out.println(num[0]); // 8 (changed)

         */








        // Object array sharing: Important
        /*
        Student[] s = new Student[3];
        s[0] = new Student("Jay", 22);
        s[1] = new Student("joya", 20);
        s[2] = new Student("Neeraj", 24);

        Student[] s2 = s.clone(); // cloned "s" array

        s[0].name = "Modified"; // modifying name of object of "s[0]"
        s[0].age = 78;// modifying age of object of "s[0]"

        // Both arrays are getting affected coz, there is no creation of new Object, The existing object itself is getting modified.
        s[0].printDetail();
        s2[0].printDetail();

         */












        /*
        // Jagged array: way 1
        int[][] jag = {
                {1},
                {1,2},
                {1,2,3}
        };


        // Jagged array: way 2

        // 1. Tell Java you want 3 rows, but don't specify column sizes yet
        int[][] jag = new int[3][];

        // 2. Allocate different sizes to each row individually
        jag[0] = new int[1]; // Row 0 has space for 1 element
        jag[1] = new int[2]; // Row 1 has space for 2 elements
        jag[2] = new int[3]; // Row 2 has space for 3 elements

        // 3. Populate your values
        jag[0][0] = 1;

        jag[1][0] = 1;
        jag[1][1] = 2;

        jag[2][0] = 1;
        jag[2][1] = 2;
        jag[2][2] = 3;





        for(int i=0; i<jag.length; i++) {
            for(int j=0; j<jag[i].length; j++) {
                System.out.print(jag[i][j]+" ");
            }
            System.out.println();
        }

         */









        // Exception In Arrays
        /*
        int[] num = null;
        System.out.println(num.length); // NullPointerException

         */

        /*
        int[] num2 = new int[1];
        num2[1] = 3; // ArrayIndexOutOfBoundsException

         */



        /*
        int[] age = new int[-8]; // NegativeArraySizeException

         */

















        // Phase 2



        // Two pointer: Binary Search
        /*
        int[]  arr = {1,2,3,4,5,23,44,45,46,57,66,87,979};
        int p1 = 0;
        int p2 = arr.length - 1;
        int target = 57;

        int resultIndex = -1;

        while(p1 < p2) {
            int mid = (p1 + p2)/2;

            if(arr[mid] == target) {
                resultIndex = mid;
                break;
            }

            if(arr[mid] < target) {
                p1 = mid+1;
            }else{
                p2 = mid - 1;
            }
        }
        System.out.println("Target: "+target+" is found and index: "+resultIndex);
//        p1 0 3
//        p2 4
//        mid 2 3
//        mid value = 3 4

         */





























    }
}
