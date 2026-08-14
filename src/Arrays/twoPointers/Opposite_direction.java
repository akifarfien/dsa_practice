package Arrays.twoPointers;

import java.util.Arrays;

public class Opposite_direction {

    //Reverse the arr in place.
    //[1, 2, 3, 4, 5]
    //O(n) time
    //O(1) extra space
    // O/P- [5, 4, 3, 2, 1]

    //      L →              ← R
    //      [ .  .  .  .  .  . ]

    /*
    * L →            ← R

         L →      ← R

              L/R
    * */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length -1 ;

        while (start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }

        Arrays.stream(arr).forEach(System.out::print);
    }

}
