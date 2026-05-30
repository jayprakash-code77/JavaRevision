package Basic.ArraysInJava;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {


        // Second largets element
        /*
        int[] arr = {43,32,66,12,32,19,95,39,43};
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int value: arr) {
            if(value > largest) {
                secondLarge = largest;
                largest = value;
            }else if(value > secondLarge && value != largest) {
                secondLarge = value;
            }
        }
        System.out.println("Largest Value: "+largest);
        System.out.println("Second Largest Value: "+secondLarge);

         */


        // frequency counting
        /*
        int[] arr = {43,32,66,12,32,19,95,19,66,32,32,32,39,43};
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int value: arr) {
                if(arr[i] == value) {
                    count++;
                }
            }
            System.out.println("The value "+arr[i]+" exists "+count+" times in the array.");
        }

         */


        // Check if Sorted
        /*
        int[] arr = {1,7,3,4,5,6};
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("Not sorted");
            }
        }

         */


        // move zeros: not in order
        /*
        int[] num = {0,1,0,3,12};
        int p1 = 0;
        int p2 = num.length-1;

        while(p1 < p2) {
            if(num[p2] == 0) {
                p2--;
            }else if(num[p1] == 0) {
                int temp = num[p1];
                num[p1] = num[p2];
                num[p2] = temp;
                p1++;
            }else{
                p1++;
                p2--;
            }

        }
        System.out.println(Arrays.toString(num));

         */



        // move zeros: In order
        /*
        int[] num = {0, 1, 0, 3, 12};
        //Step 1: move zeros in the last
        int replacePos = 0;
        for(int i=0; i<num.length; i++) {
            if(num[i] != 0) {
                num[replacePos] = num[i];
                replacePos++;
            }
        }
        System.out.println(Arrays.toString(num));
        //Step 2: make the other places as zero
        while(replacePos < num.length) {
            num[replacePos] = 0;
            replacePos++;
        }
        System.out.println(Arrays.toString(num));

         */












        // Remove Duplicates
        /*
        int[] arr = {1,1,2,2,3};
        int uniquePos = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[uniquePos] != arr[i]) {
                arr[++uniquePos] = arr[i];
            }
        }
        System.out.println("There are only "+(++uniquePos)+" elements in the arr"+Arrays.toString(arr)+" that are unique.");

         */













        //  Reverse the array
        /*
        int[] arr = {1, 4, 3, 2, 6, 5};
        int p1 = 0;
        int p2 = arr.length - 1;
        while(p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(arr));

         */


















        // Shifting in arrays

        // Left Shift
        /*
        int[] arr = {1,2,3,4};
        int hold = arr[arr.length-1];
        for(int i=arr.length - 2; i>=0; i--) {
            int temp = arr[i];
            arr[i] = hold;
            hold = temp;
        }
        System.out.println(Arrays.toString(arr));

         */





        // Right shift
        /*
        int[] arr = {1,2,3,4};
        int hold = arr[0];
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            arr[i] = hold;
            hold = temp;
        }
        System.out.println(Arrays.toString(arr));

         */











        // Left Rotate by 1
        /*
        int[] arr ={1,2,3,4,5};
        int size = arr.length;
        int losingValue = arr[0];
        int hold = arr[size-1];

        for(int i=arr.length - 2; i>=0; i--) {
            int temp = arr[i];
            arr[i] = hold;
            hold = temp;
        }
        arr[arr.length-1] = losingValue;
        System.out.println(Arrays.toString(arr));

         */














        // Rotate right by 1
        /*
        int[] arr = {1,2,3,4,5};
        int losingValue = arr[arr.length-1];
        int hold = arr[0];
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            arr[i] = hold;
            hold = temp;
        }
        arr[0] = losingValue;
        System.out.println(Arrays.toString(arr));

         */



        // rotate left without extra hold and temp variable.
        /*
        int[]  arr = {1,2,3,4,5};
        int losingVal = arr[0];
        for(int i=0; i<arr.length-2; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = losingVal;
        System.out.println(Arrays.toString(arr));

         */















        // rotate right without extra hold and temp variable.
        /*
        int[] arr = {1,2,3,4,5};
        int losingValue = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = losingValue;
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

         */











        //Brute force: Right Rotate by k
        /*
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        for(int i=0; i<k; i++) {
            int losingElement = arr[arr.length - 1];
            for(int j= arr.length-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = losingElement;
        }
        System.out.println(Arrays.toString(arr));

         */







    }
}