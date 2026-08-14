package Arrays.twoPointers;

import java.util.Arrays;

public class RemoveElements {

    //Remove all occurrences of 3 in-place, preserving the order of everything else.
    //[3, 2, 3, 1, 3, 4, 3, 5]

    //write → next position where a VALID element should be placed
    //scan  → explores every element

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 3, 4, 3, 5};

        int write = 0;

        for (int scan = 0; scan < arr.length;scan++){

            if(arr[scan] != 3){
                arr[write] = arr[scan];

                write++;
            }

        }

        Arrays.stream(arr).forEach(System.out::print);

    }
}
