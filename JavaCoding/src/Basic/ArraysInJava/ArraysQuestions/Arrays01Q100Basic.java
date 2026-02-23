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

    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int numOfNum = str.length();
            if(numOfNum % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}



