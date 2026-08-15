package Arrays.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindallSumParisForTarget_UniqueAndSorted {
    //[1, 1, 1, 2, 2, 3, 4]
    //target = 5

    //Find all unique pairs for the sum.
    //skip duplicate

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3, 4};
        int target = 5;

        List<int[]> result = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        int prevLeft = Integer.MIN_VALUE;
        int prevRight = Integer.MAX_VALUE;

        while (start < end) {

            int sum = arr[start] + arr[end];

            // Found a new unique pair
            if (sum == target
                    && arr[start] != prevLeft
                    && arr[end] != prevRight) {

                result.add(new int[]{arr[start], arr[end]});

                // Remember the pair BEFORE moving pointers
                prevLeft = arr[start];
                prevRight = arr[end];

                start++;
                end--;

                // Skip duplicate left values
                while (start < end && arr[start] == prevLeft) {
                    start++;
                }

                // Skip duplicate right values
                while (start < end && arr[end] == prevRight) {
                    end--;
                }
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }

        result.stream()
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }

    }
