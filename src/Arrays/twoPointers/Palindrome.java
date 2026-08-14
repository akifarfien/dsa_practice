package Arrays.twoPointers;

public class Palindrome {

    //Check if the array is palindrome
    //use O(n) time and space O(1)
    //[1, 2, 3, 2, 1] → true
    //[1, 2, 3, 4, 1] → false

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,2, 1};
       boolean res = isPalindrome(arr);
        System.out.println(res);

    }

    static boolean isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <  end){
            if(arr[start] != arr[end]) return false;

            start++;
            end--;
        }
        return true;
    }
}
