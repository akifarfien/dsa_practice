package Arrays.twoPointers;

import java.util.Arrays;

public class SortedArray_clubAllUniqueNums {

    //A sorted array given which has duplicates
    //Move all unique number to the starting of the array.
    // input arr = [1, 1, 2, 2, 2, 3, 4, 4]
    // output = [1, 2, 3, 4 | ...]

    public static void main(String[] args) {

        //int[] arr = {1, 1, 2, 2, 2, 3, 4, 4};
        int[] arr = new int[]{1, 1, 2, 2, 2, 3, 4, 4};

        int write = 1;

        for(int scan = 1; scan < arr.length;scan++){
            if(arr[scan] != arr[write-1]){
                arr[write] = arr[scan];
                write++;
            }
        }

        Arrays.stream(arr).forEach(System.out::print);

    }

}
