import java.util.*;

public class ReverseArray {

    // Function to reverse the array
    public static void reverseArr(int arr[]) {
        int first = 0, last = arr.length - 1; // Initialize first and last pointers
        while (first < last) {
            // Swap elements at first and last
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 12, 45, 65, 45, 32, 21 }; // Example array to reverse

        // Reverse the array
        reverseArr(numbers);

        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(""); // Print new line after the array
    }
}
