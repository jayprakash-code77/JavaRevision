package Basic.ArraysInJava.ArraysQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Provides solutions for basic array-related problems.
 *
 * <p>This class includes optimized in-place algorithms
 * for detecting duplicates and other common array tasks.</p>
 *
 * @author Jayprakash Maurya
 * @version 1.0
 * @since 2026
 */
public class Arrays01Q100Basic {

    /**
     * Finds duplicate elements in an integer array(In-place index marking).
     *
     * <p>This method uses an in-place index marking technique.
     * It assumes that:
     * <ul>
     *     <li>Array elements are in range 1 to n</li>
     *     <li>n = arr.length</li>
     * </ul>
     *
     * <p>The algorithm works by marking visited indices as negative.
     * If an index is already negative, the element is a duplicate.</p>
     *
     * <p><b>Important:</b> This method modifies the input array.</p>
     *
     * <p>Time Complexity: O(n)</p>
     * <p>Space Complexity: O(1) (excluding result list)</p>
     *
     * @param arr input integer array containing values from 1 to n
     * @return list of duplicate elements
     * @throws IllegalArgumentException if array is null
     */
    public List<Integer> findDuplicates_MVIAN(int[] arr) {
//  MVIAN: Marking Visited Index As Negative
//  throw Exception if "arr" is "null"
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
//  Declaring and creating ArrayList for result
        List<Integer> result = new ArrayList<>();
//  Main for loop operations
        for (int i = 0; i < arr.length; i++) {
//          Element present at "i"th index, will be stored in "index variable decreasing value by 1".
            int index = Math.abs(arr[i]) - 1;

//          Checking for negative value of arr[index]
            if (arr[index] < 0) {
//              arr[index] < 0: Duplicate found, add to result List
                result.add(Math.abs(arr[i]));
            } else {
//              arr[index] > 0: Non-negative, make the element negative present at arr[index].
                arr[index] = -arr[index];
            }
        }
//      return the final result array
        return result;
    }


    /**
     * Find the duplicate element in array(Using HashSet data structure).
     *
     * This method uses the HashSet property of storing unique values.
     *
     * This algorithm works by making use HashSet. It simply adds values to the HashSet and checks if value is present in the Set. If the value is present, it is a Duplicate value.
     *
     * <p>Time Complexity: O(n)</p>
     * <p>Space Complexity: O(1) (excluding result list)</p>
     *
     * @param arr input integer array.
     * @return ArrayList with values which are duplicate in the <b>arr</b> input.
     * @throws IllegalArgumentException if array is null.
     */
    public List<Integer> findDuplicates_HashSet(int[] arr) {
        // Checking for null value as input.
        if(arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
//      Set for storing the unique values
        Set<Integer> uniqueValue = new HashSet<>();
//      List for storing the duplicate values present in the input array.
        List<Integer> duplicateNum = new ArrayList<>();
        for(int element: arr) {
            // Add element to HashSet to check if the element is unique or not.
            if(uniqueValue.contains(element)) {
//              // Adding elements to ArrayList which are already present in the HashSet which means, it is duplicate.
                duplicateNum.add(element);
            }else{
                uniqueValue.add(element);
            }
        }
//      returning the ArrayList Containing the elements which were found duplicate in the input array.
        return duplicateNum;
    }



    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     *
     * <p>This method uses <b></><i>String.valueOf()</i></b>.</p>
     * <ul>
     *     <li>Convert int into String.</li>
     *     <li>Find the length of the string of num.</li>
     *     <li>If length is even: <b>result++</b></li>
     * </ul
     * <p>Time Complexity: O(n)</p>
     * <p>Space Complexity: O(1) (excluding result )</p>
     *
     *
     * @param arr input integer array.
     * @return num of even numbers.
     * @throws IllegalArgumentException if array is null
     *
     */

    public int findNumbers(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            String str = String.valueOf(arr[i]);
            int numOfNum = str.length();
            if(numOfNum % 2 == 0) {
                result++;
            }
        }
        return result;
    }




    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            boolean isGood = true;

            // Check element at index i - k (if it exists)
            if (i - k >= 0) {
                if (nums[i] <= nums[i - k]) {
                    isGood = false;
                }
            }

            // Check element at index i + k (if it exists)
            if (isGood && i + k < n) {
                if (nums[i] <= nums[i + k]) {
                    isGood = false;
                }
            }

            // If it passed both checks, it's a "good" number
            if (isGood) {
                totalSum += nums[i];
            }
        }

        return totalSum;
    }


    /**
     * Find pair with given sum in a Sorted array.
     *
     * <p>Given an array <b>arr</b> of size <b>n</b>.</p>
     * <p>We need to find all pairs in the array that sum up to a number equal to <b>K</b>.</p>
     * <p>If no such pair exists, <b>return -1</b></p>
     *
     * <p>Time Complexity: O(n)</p>
     * <p>Space Complexity: O(1) (excluding result list)</p>
     *
     * @param arr input integer array, sorted in increasing order and an integer <b>K</b>.
     * @return List of pairs that sum up to <b>K</b>. If no pair found, returns an empty ArrayList;
     * @throws IllegalArgumentException if the array is null.
     *
     */

    public ArrayList<int[]> pairSumOfArray(int arr[], int K) {
        if(arr == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        int lowIndex = 0;
        int highIndex = arr.length - 1;
        ArrayList<int[]> result = new ArrayList<>();

        int idxOfPairSums = 0;

        while (lowIndex < highIndex) {
            if(arr[lowIndex] + arr[highIndex] == K) {
                int pairArr[] = {arr[lowIndex], arr[highIndex]};
                result.add(pairArr);
                idxOfPairSums++;
            }
            if(arr[lowIndex] + arr[highIndex] < K) {
                lowIndex++;
            }else{
                highIndex--;
            }
        }
        return result;
    }


    /**
     * Find common element in three sorted array.
     *
     * <p>Given three sorted array, we need to find find the element which are common in all three arrays.</p>
     * <p>If no such element exits, return empty list.</p>
     *
     * <p>Time Complexity: O(n)</p>
     * <p>Space Complexity: O(1) (excluding result list)</p>
     *
     * @param arr1
     * @param arr2
     * @param arr3
     * @return List of element which are common in all three given arrays.
     * @throws IllegalArgumentException if any array is <b>null</b>.
     */

    public ArrayList<Integer> commonElementInThreeSortedArray(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> result = new ArrayList<>();
        int arr1Pointer = 0, arr2Pointer = 0, arr3Pointer = 0;
        while(arr1Pointer < arr1.length && arr2Pointer < arr2.length && arr3Pointer < arr3.length) {
            if(arr1[arr1Pointer] == arr2[arr2Pointer] && arr1[arr1Pointer] == arr3[arr3Pointer]) {
                result.add(arr1[arr1Pointer]);
                arr1Pointer++;
                arr2Pointer++;
                arr3Pointer++;
            }else if(arr1[arr1Pointer] < arr2[arr2Pointer]) {
                arr1Pointer++;
            }else if(arr1[arr1Pointer] > arr2[arr2Pointer]) {
                arr2Pointer++;
            }else if(arr2[arr2Pointer] < arr3[arr3Pointer]) {
                arr2Pointer++;
            }else {
                arr3Pointer++;
            }
        }
        return result;
    }

}



