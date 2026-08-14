package Arrays.twoPointers;

public class TwoSum {

    //Find whether there is a pair of elements whose sum equals 7.
    //same converging-pointer pattern
    //[1, 2, 3, 4, 5, 6]

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int target = 10;

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            if(target == arr[start]+arr[end]) {
                System.out.println("Pair found - " + start + " : " + end);
                return;
            }

            else if(target < arr[start]+arr[end]) end--;
            else if(target > arr[start]+arr[end]) start++;

        }

    }
}
