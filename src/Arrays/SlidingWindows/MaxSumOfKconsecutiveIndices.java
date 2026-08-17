package Arrays.SlidingWindows;

public class MaxSumOfKconsecutiveIndices {

    //Sliding Window

    //Find the maximum sum of any 3 consecutive elements.
    //[2, 1, 5, 1, 3, 2]
    // k=3
    //[2, 1, 5] → 8
    //[1, 5, 1] → 7
    //[5, 1, 3] → 9  ← maximum
    //[1, 3, 2] → 6
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumOfKconsecutiveElements(arr, k);

        System.out.println(result);
    }

    public static int maxSumOfKconsecutiveElements(int[] arr, int k){

        if(null == arr || arr.length < k) return -1;

        int windowSum = 0;
        int maxWindowSum  = 0;

        for(int i = 0; i<k;i++){
            windowSum += arr[i];
        }
        maxWindowSum = windowSum;

        for(int i = k; i < arr.length; i++ ){
            windowSum -= arr[i-k];

            windowSum += arr[i];

          maxWindowSum =  Math.max(windowSum, maxWindowSum);
        }

        return maxWindowSum;
    }
}
