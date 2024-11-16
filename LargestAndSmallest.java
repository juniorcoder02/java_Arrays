import java.util.*;

public class LargestAndSmallest {

    /**
     * This method returns the largest element in the array.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Space Complexity: O(1), since it uses a constant amount of extra space.
     *
     * @param arr The array to find the largest element in.
     * @return The largest element in the array.
     */
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    /**
     * This method returns the smallest element in the array.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Space Complexity: O(1), since it uses a constant amount of extra space.
     *
     * @param arr The array to find the smallest element in.
     * @return The smallest element in the array.
     */
    public static int getSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr1[] = { 12, 34, 65, 43, 23, 21 };
        int arr2[] = { 43, 55, 76, 899, 87, 56 };

        System.out.println("The largest element in Array1 is: " + getLargest(arr1));
        System.out.println("The smallest element in Array1 is: " + getSmallest(arr1));
        System.out.println("The largest element in Array2 is: " + getLargest(arr2));
        System.out.println("The smallest element in Array2 is: " + getSmallest(arr2));
    }
}
