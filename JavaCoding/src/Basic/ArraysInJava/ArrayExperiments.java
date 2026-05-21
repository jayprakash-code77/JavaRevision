package Basic.ArraysInJava;

import java.util.Arrays;

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






        //










    }
}
