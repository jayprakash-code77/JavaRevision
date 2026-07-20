package Basic.ArraysInJava;

import java.util.Arrays;
import java.util.HashSet;

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
        /*
        int[] arr = {1, 0, 1, 1, 0};
        int k=1;

        int max = 0;
        int left = 0;
        int zerosCount = 0;

        for (int right = 0; right <arr.length; right++) {

            if(arr[right] == 0) {
                zerosCount++;
            }
            while (zerosCount > k) {
                if(arr[left] == 0) {
                    zerosCount--;
                }
                left++;
            }
            max = Math.max(max, right-left+1);

        }
        System.out.println(max);

         */




        /*
        3. Max Consecutive Ones (Dynamic Window)This introduces you to the dynamic/variable size window, where the window expands and shrinks based on a condition.The Problem: Given a binary array nums, find the maximum number of consecutive 1s in the array if you can flip at most one 0.Example: nums = [1, 0, 1, 1, 0], k = 1 $\rightarrow$ Output: 4 (by flipping the first 0, the subarray becomes [1, 1, 1, 1]).Why it’s basic: It introduces the standard dynamic window logic: expand right, and if the count of 0s exceeds your limit, shrink from the left until the window is valid again.
        4. Minimum Size Subarray Sum (Dynamic Window)Often referred to as the "Shortest Window" starter problem.The Problem: Given an array of positive integers and a target integer target, find the minimal length of a contiguous subarray of which the sum is greater than or equal to target. If there isn't one, return 0.Example:
        target = 7, nums = [2, 3, 1, 2, 4, 3] $\rightarrow$ Output: 2 (the subarray [4, 3] has the minimum length).Why it’s basic: It flips the dynamic logic. Instead of shrinking when a window becomes invalid, you shrink the window as long as it remains valid to find the smallest possible size.

        */


        /*
        int target = 7;
        int[] arr = {2, 3, 1, 2, 4, 3};

        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum = sum-arr[left];
                left++;
            }
        }
        System.out.println(minLen);

         */

        /*
        int target = 7;
        int[] arr = {2, 3, 1, 2, 4, 3};

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right]; // 2

            while (sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum = sum - arr[left]; // 0
                left++; // 0
            }
        }
        System.out.println(minLen);

         */






        // 5. Longest Substring Without Repeating Characters (Dynamic Window)The classic introduction to using a tracking mechanism (like a Hash Set or frequency array) alongside your window pointers.The Problem: Given a string s, find the length of the longest substring without repeating characters.Example: s = "abcabcbb" $\rightarrow$ Output: 3 (the substring is "abc").Why it’s basic: It teaches you how to use a data structure to check for window validity. If you encounter a character already in your set, you shrink the window from the left until that duplicate character is kicked out.

        // Using : HashSet
        /*
        String name = "jayprakash";
        int longestStringLength = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < name.length(); right++) {

            while(set.contains(name.charAt(right))){
                set.remove(name.charAt(left));
                left++;
            }
            set.add(name.charAt(right));

            longestStringLength = Math.max(longestStringLength, right-left+1);
        }

        System.out.println(longestStringLength);

         */






        // Without using Data Structures
        /*
        String name = "jayprakash";
        int longestStringLength = 0;
        int left = 0;

        for (int right = 0; right < name.length(); right++) {
            char currentChar = name.charAt(right);
            int duplicateSIndex = name.indexOf(currentChar, left);

            if(duplicateSIndex < right) {
                left = duplicateSIndex+1;
            }

            longestStringLength = Math.max(longestStringLength, right-left+1);
        }
        System.out.println(longestStringLength);

         */













        //MAXIMUM SUM SUBARRAY OF SIZE K
        /*
        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            if(right-left+1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(maxSum);

         */

















        // MINIMUM SUM SUBARRAY OF SIZE K
        /*
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int minSum = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            if(right-left+1 == k) {
                minSum = Math.min(minSum, sum);
                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(minSum);

         */











        // Maximum subarray average of size k
        /*
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int left = 0;
        int sum = 0;
        float maxAverage = Float.MIN_VALUE;

        for(int right=0; right < arr.length; right++) {
            sum = sum + arr[right];

            if(right-left+1 == k) {
                maxAverage = Math.max((float) sum / k, maxAverage);
                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(maxAverage);

         */


















        // MAX CONSECUTIVE ONES
        /*
        int[] arr = {1,1,1,0,1,1};
        int maxConZeros = Integer.MIN_VALUE;
        int count = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if(arr[right] == 1) {
                count++;
            }else{
                count = 0;
            }
            maxConZeros = Math.max(maxConZeros, count);
        }
        System.out.println(maxConZeros);

         */











//        MAX CONSECUTIVE ONES:You can flip at most k zeros
        /*
        int[] arr = {1,1,1,0,1,1};
        int k = 1;
        int maxConsecutiveZeros = Integer.MIN_VALUE;
        int zeroCount = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if(arr[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(arr[right] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxConsecutiveZeros = Math.max(maxConsecutiveZeros, right-left+1);
        }
        System.out.println(maxConsecutiveZeros);

         */
















        // Test run
        /*
        int[] arr = {1,4,2,5,8,2,1};
        int k=3;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            if(right - left == k-1 ) {
//                if(sum > max) {
//                    max = sum;
//                }
                max = Math.max(sum, max);

                sum = sum - arr[left];
                left++;
            }
        }
        System.out.println(max);

         */














        //


    }
}
