package Arrays.twoPointers;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindallthePairsforTarget_sorted {

    //Find all the pairs == target -- can be duplicate
    //[1, 1, 1, 2, 2, 3, 4]
    //target = 5


    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3, 4};
        int target = 5;

        List <int[]> result = new ArrayList<>();

        int start = 0;
        int end = arr.length-1;

        while(start<end){

            if(target == arr[start] + arr[end]){
                result.add(new int[]{arr[start], arr[end]});
                start++;
                end--;
            }

            if(target > arr[start] + arr[end]) start++;
            else end--;
        }

        result.stream().flatMapToInt(Arrays::stream).forEach(System.out::print);
    }
}
