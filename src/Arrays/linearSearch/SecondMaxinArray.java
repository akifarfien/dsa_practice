package Arrays.linearSearch;

public class SecondMaxinArray {

    public static void main(String[] args) {
        int result = findSecondLargest(new int[]{-1,2,3,4,5,6,7, -100, 12});
        System.out.println(result);
    }

    public  static  int findSecondLargest(int[] arr){

        if(null == arr) return 0;
        if(arr.length < 2) return 0;

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){

            if(max < arr[i]){
                secondMax = max;
                max = arr[i];
            }
            else if(max > arr[i] &&  secondMax < arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


}
