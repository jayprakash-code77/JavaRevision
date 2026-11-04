package SearchingSortingAlgorithms.LinearSearch;

public class L1_GeneralImp {
    public static void main(String[] args) {
        int[] nums = {13, 54, 27,9,1,76,22,89};
        int target = 76;
        int ansIndex = -1;
        for(int i =0; i<nums.length; i++) {
            if(nums[i] == target) {
                ansIndex = i;
                break;
            }
        }
        if(ansIndex == -1){
            System.out.println("Target Not Found");
        }else{
            System.out.println("The target found at index: "+ ansIndex);
        }
    }
}
