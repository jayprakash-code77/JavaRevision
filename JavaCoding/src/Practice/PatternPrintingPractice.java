package Practice;

public class PatternPrintingPractice {
    public static void main(String[] args) {

        // solid square
        /*
        int num = 3;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */






        // hollow square
        /*
        int num = 10;
        for(int i=0; i<num; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for(int i=0; i<num-2; i++) {
            System.out.print("* ");
            for(int j=1; j<num-1; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }

        for(int i=0; i<num; i++) {
            System.out.print("* ");
        }

         */

        // 2nd Way for hollow square
        /*
        int row = 5;
        int col = 5;
        //outer loop
        for(int i=1; i<=row; i++) {
            //inner loop
            for(int j=1; j<=col; j++){
                // condition for start print
                if(i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("* ");
                }else{ // else print space
                    System.out.print("  ");
                }
            }
            // next  line
            System.out.println();
        }

         */

















        // half pyramid
        /*
        int num = 5;
        // outer number
        for(int i=1; i<=num; i++) {
            // inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }

         */


        // inverted half pyramid
        /*
        int num = 5;
        //outer loop
        for(int i=0; i<num; i++) {
            // inner loop
            for(int j=0; j<num-i; j++) {
                // print star
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }

         */






        // 180 degree rotated pyramid
        /*
        int num = 4;
        //outer loop
        for(int i=0; i<num; i++) { // 0 1 2 3
            // inner loop for space
            for(int j=0; j<num-1-i; j++) {
                System.out.print("  ");
            }

            // inner loop for star
            for(int k = 0; k<=i; k++){ // 1: 2: 3: 4:
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }

         */












        // half pyramid wit numbers
        /*
        int num = 5;
        // outer loop
        for(int i=1; i<=num; i++) {
            // inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            // new line
            System.out.println();
        }

         */






        // inverted half pyramid with numbers
        /*
        int num=5;
        //outer loop
        for(int i=1; i<=num; i++) {
            // inner loop
            for(int j=1; j<=num-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

         */





        // Floyd's triangle
        /*
        int num = 5;
        int count = 1;
        // outer loop
        for(int i=0; i<num; i++) {
            // inner loop
            for(int j=0; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            // next line
            System.out.println();
        }

         */










        // 0 - 1 Triangle : 1st Approach
        /*
        int num = 5;
        //outer loop
        for(int i=1; i<=num; i++) {
            // inner loop
            int start = 1;

            if(i%2 == 0) { // if "i" is even then start with 0 else start with one
                start = 0;
            }

            for(int j=1; j<=i; j++) {
                System.out.print(start+" ");
                if(start == 0){
                    start++;
                }else{
                    start--;
                }
            }

            //next line
            System.out.println();
        }

         */

        // 0 - 1 Triangle : 2st Approach
        /*
        int num = 5;
        // outer loop
        for(int i=1; i<=num; i++ ){
            // inner loop
            for(int j=1; j<=i; j++) {
                if((i+j)%2 == 0) { // even  == print 1
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

         */












        // rhombus
        /*
        int num = 5;
        //outer loop
        for(int i=1; i<=num; i++) {
            // inner loop for space
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }

            // inner loop for star
            for(int k=1; k<=num; k++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }

         */









        // number pyramid
        /*
        int num = 5;
        //outer loop
        for(int i=1; i<=num; i++) {
            // inner loop for space: 1st part
            for(int j=1; j<=num-i; j++) {
                System.out.print("  ");
            }

            // inner loop for numbers: 1st part
            for(int k=1; k<=i+(i-1); k++) {
                System.out.print(i+" ");
            }

            // new line
            System.out.println();
        }

         */












    }
}
