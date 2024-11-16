
import java.util.Arrays;

public class RotateArray {

    // approach to solve this question
    // Rotate the array by k positions to the right
    // Reverse the entire array first
    // Reverse the first k elements
    // Reverse the remaining elements

    public static void rotate(int[] arr, int k) {
        // Handle edge cases
        if (arr == null || arr.length == 0 || k < 0) {
            return;
        }
        k = k % arr.length; // Normalize k to be within the array length
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    // Helper method to reverse a subarray
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 }; // original array
        int k = 1; // number of rotation
        // expected output [5,6,7,1,2,,3,4]; rotate from 3 places
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}