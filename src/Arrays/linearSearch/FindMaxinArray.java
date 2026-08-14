package Arrays.linearSearch;

public class FindMaxinArray {

    public static void main(String[] args) {
      int result =  findMax(new int[]{2,3,9,8,10,1,3});
        System.out.println(result);
    }


    static int findMax(int[] arr){
        int max  = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }



//    static int findMax(int[] arr){
//
//        int max  = 0;
//
//        for(int num:arr){
//            if(max < num) max = num;
//
//        }
//        return max;
//
//    }
}


