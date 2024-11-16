public class MaxSubArraySum {

    /**
     * Brute Force Method:
     * This method calculates the maximum sum of all subarrays using a brute force
     * approach.
     *
     * Time Complexity: O(n^3) - Three nested loops iterate through the array.
     * Space Complexity: O(1) - No extra space is used except for a few variables.
     */
    public static void bruteForceMethod(int[] numbers) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value

        // Outer loop for selecting the start index of subarrays
        for (int i = 0; i < numbers.length; i++) {
            // Middle loop for selecting the end index of subarrays
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0; // Reset current sum for each subarray

                // Inner loop to calculate the sum of elements in the current subarray
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k]; // Accumulate subarray sum
                }

                // Update maxSum if the current subarray sum is greater
                maxSum = Math.max(maxSum, currSum);
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum sum of subarrays (Brute Force): " + maxSum);
    }

    /**
     * Prefix Sum Method:
     * This method calculates the maximum subarray sum using a prefix sum approach.
     *
     * Time Complexity: O(n^2) - Two loops are used, and prefix sums are precomputed
     * in O(n).
     * Space Complexity: O(n) - We store the prefix sums in an additional array.
     */
    public static void prefixSumMethod(int[] numbers) {
        int n = numbers.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];

        // Calculate prefix sums
        prefix[0] = numbers[0]; // First element remains the same
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Iterate through subarrays and calculate their sum using prefix array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; // Compute subarray sum
                maxSum = Math.max(maxSum, currSum); // Update maxSum if necessary
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum sum of subarrays (Prefix Sum): " + maxSum);
    }

    /**
     * Kadane’s Algorithm:
     * This method calculates the maximum subarray sum using Kadane’s algorithm.
     *
     * Time Complexity: O(n) - Only one pass through the array is needed.
     * Space Complexity: O(1) - Only a few variables are used for the running sum
     * and max sum.
     */
    public static void kadanesMethod(int[] numbers) {
        int maxSum = numbers[0]; // Initialize to the first element in the array
        int currSum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        // Print the maximum subarray sum
        System.out.println("Maximum sum of subarrays (Kadane’s Algorithm): " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers1 = { -5, 3, 2, -1, 4 }; // Sample array for testing brute force and prefix methods

        // Test Brute Force method
        System.out.println("=== Brute Force Method ===");
        bruteForceMethod(numbers1);

        // Test Prefix Sum method
        System.out.println("\n=== Prefix Sum Method ===");
        prefixSumMethod(numbers1);

        // Test kadane's Sum method
        System.out.println("\n=== kadane's Sum Method ===");
        kadanesMethod(numbers1);

        // Test Kadane's Algorithm with a different array
        int[] numbers2 = { -2, -3, 4, -1, -2, 1, 5, -3 }; // Array with mixed positive and negative numbers
        System.out.println("\n=== Kadane’s Algorithm ===");
        kadanesMethod(numbers2);
    }
}
