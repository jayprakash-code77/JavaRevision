package Basic.ArraysInJava;

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


    }
}
