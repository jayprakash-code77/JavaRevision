package Basic.ArraysInJava;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        // Sliding Window


        // Maximum Sum Subarray of Size K  (Fixed Window).
        /*
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k=3;
        int maxSum = Integer.MIN_VALUE;

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            if(right-left+1 == k) {
                // when we have reached the fixed window
                if(maxSum < sum) {
                    maxSum = sum;
                }

                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(maxSum);

         */







        // Average of All Subarrays of Size K (Fixed Window)
        /*
        int[] arr = {1, 3, 2, 6, -1};
        int k = 3;
        float[] result = new float[(arr.length/k)+2];
        int left = 0;
        int sum = 0;
        int resultIndex = 0;

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];

            if(i-left+1 == k) {
                result[resultIndex] =(float)sum/k;
                resultIndex++;

                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(Arrays.toString(result));

         */












        // Max Consecutive Ones (Dynamic Window)
        int[] arr = {1, 0, 1, 1, 0};
        int k=1;
        int result = 0;
        boolean isFlipped = false;

        int left = 0;
        for (int right = 0; right <arr.length; right++) {
//            if(!isFlipped && arr[right] == 0) {
//                result++;
//                isFlipped = true;
//            }



        }







    }
}
