package Arrays.twoPointers;

import java.util.Arrays;

public class MoveZeroToTheEnd {

    // This is Two-pointer - Fast Slow pointer problem.


    //main
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 0,12});
    }


    static void moveZeroes(int[] arr) {
        int write = 0;

        for (int scan = 0; scan < arr.length; scan++) {

            if (arr[scan] != 0) {
                int temp = arr[write];
                arr[write] = arr[scan];
                arr[scan] = temp;

                write++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);

    }


    /*static void moveZeroes(int[] arr){

        //not including the edge cases

        int write = 0;
        int scan = 1;

        while (scan < arr.length){

            if(arr[write] == 0 && arr[scan] == 0 ) scan++;

            else if(arr[write] == 0 && arr[scan] != 0){
                arr[write] = arr[scan];
                arr[scan] = 0;
                write++;
                scan++;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }*/
}
