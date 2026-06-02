package Basic.ArraysInJava;

import java.util.Arrays;

public class TowPointer {
    public static void main(String[] args) {

        // Tow pointer: Sorted Arrays
        /*
        int[] arr = {1,2,3,4,6};
        int low = 0;
        int high = arr.length-1;
        int target = 6;
        while (low < high) {
            if(arr[low] + arr[high] == target) {
                System.out.println("Two number are "+arr[low]+" " +
                        "and "+arr[high]+" which sum up to "+target);
                break;
            }else if(arr[low] + arr[high] > target) {
                high--;
            }else{
                low++;
            }
        }

         */





        // Tow pointer: Un-Sorted Arrays














        // Palindrome:
        /*
        int[] arr = {1,2,3,3,2,1};
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            if(arr[left] != arr[right]) {
                System.out.println("Not Palindrome.");
                break;
            }
            left++;
            right--;
        }

         */









        // Palindrome: String
        /*
        String str = "madjam";
        int start = 0;
        int end = str.length()-1;
        boolean  isPalindrome = true;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++; end--;
        }
        if(isPalindrome) {
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }


         */









        // Remove Duplicates: Sorted Array
        /*
        int[] num = {1,2,2,3,4,5,5,6,6,7,8,9};
        int slow = 0;
        int fast = 1;
        while (fast < num.length) {
            if(num[slow] == num[fast]) {
                fast++;
            }else {
                slow++;
                num[slow] = num[fast];
                fast++;
            }
        }
        System.out.println(Arrays.toString(num));

         */









        // Move Zeros
        /*
        int[] num = {0,1,0,3,12};
        int slow = 0;
        int fast = 0;
        while (fast < num.length) {
            if(num[fast] != 0) {
                int temp = num[fast];
                num[fast] = num[slow];
                num[slow] = temp;
                fast++;
                slow++;
            }else{
                fast++;
            }
        }
        System.out.println(Arrays.toString(num));

         */















        // CONTAINER WITH MOST WATER:
        /*
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right) {
            int minHeight = Math.min(height[left], height[right]);

            int width = right - left;

            int area = minHeight * width;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        System.out.println("Max area: "+maxArea);

         */
















        // SQUARES OF SORTED ARRAY: [-4,-1,0,3,10] -> [16,1,0,9,100] -> [0,1,9,16,100]: Using O(n) -> Two pointer approach
        /*
        int[] arr = {-4,-1,0,3,10};
        int[] result = new int[arr.length];

        int left = 0;
        int right = arr.length-1;

        int idx = arr.length-1;
        while (idx >=0) {
            int leftSqr = arr[left] * arr[left];
            int rightSqr = arr[right] * arr[right];

            if(leftSqr < rightSqr) {
                result[idx] = rightSqr;
                right--;
            }else{
                result[idx] = leftSqr;
                left++;
            }
            // update idx
            idx--;
        }
        System.out.println(Arrays.toString(result));

         */












        // DUTCH NATIONAL FLAG:
        /*
        int[] arr = {1,2,0,0,1,2};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1) {
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

         */












        //























    }
}
