package Basic.ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;
public class Practice {

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Arrays input

        /*
        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

         */







        // max value in array
        /*
        int[] arr = {1,2,3,4,67};
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        Practice.printArray(arr);

         */













        // 2D arrays
        /*
        String[][] connections = new String[2][2];
        connections[0][0] = "Jay";
        connections[0][1] = "Prakash";
        System.out.println(connections[0][1]);

         */







        // 2D array input
        /*
        int[][] arr= new int[2][2];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {

            }
        }

         */












        // Row and Column
        /*
        int[][] arr = new int[3][1];
        arr[0][0] = 2;
        arr[1][0] = 4;
        arr[2][0] = 7;
        System.out.println(Arrays.deepToString(arr));

         */











        //
        /*
        float[][] percent = new float[3][1];
        percent[0][0] = 2.34f;
        percent[1][0] = 45.7f;
        percent[2][0] = 89.1f;
        System.out.println(Arrays.deepToString(percent));

        for(int i=0; i<percent.length; i++) {
            for(int j=0; j<percent[0].length; j++) {
                System.out.println(percent[i][j]);
            }
        }

         */










        //











        //  Length: Row and Column
        /*
        String[] names = new String[2];
        names[0] = "Jayprakash";
        names[1] = "Maurya";
        System.out.println(Arrays.toString(names));

         */






        /*


        int[][] arr = new int[3][5];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));


         */








        /*
        int[][] arr = {{1,2,39,4},{6,7,8,9}};
        int max = arr[0][0];
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

         */

















        // Row-wise sum
        /*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for(int i=0; i<matrix.length; i++) {
            int sum = 0;
            for (int j=0; j<matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Row "+i+" total sum is "+sum);
            sum = 0;
        }

         */









        // column-wise sum
        /*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        int row = matrix[0].length;
//        int col = matrix.length;

        for(int i=0; i< matrix[0].length; i++) {
            int colSum = 0;
            for (int j=0; j<matrix.length; j++){
                colSum = colSum + matrix[j][i];
            }

            System.out.println(colSum);
        }

         */


















    }
}
