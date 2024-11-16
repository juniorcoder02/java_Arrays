public class SubArrays {

    /**
     * Method to print all subarrays and calculate their sum.
     * 
     * Steps to solve:
     * 1. Initialize variables:
     *    - ts (total subarrays) to count the total number of subarrays.
     *    - sumOfSubarrays to store the sum of the elements in each subarray.
     * 
     * 2. Outer loop (i): Iterate through each element in the array.
     *    - This represents the starting index of the subarray.
     * 
     * 3. Middle loop (j): Iterate from the current starting index (i) to the end of the array.
     *    - This represents the ending index of the subarray.
     * 
     * 4. Inner loop (k): Iterate from the starting index (i) to the ending index (j).
     *    - Print each element of the subarray.
     *    - Keep a running sum of the elements of the subarray.
     * 
     * 5. After printing a subarray, output the sum of that subarray and reset the sum.
     * 
     * 6. Finally, print the total number of subarrays found.
     * 
     * Time Complexity:
     * - The time complexity of this solution is O(n^3) because there are three nested loops.
     * 
     * Space Complexity:
     * - The space complexity is O(1), as no extra space is used except for a few variables.
     */

    public static void subArrays(int arr[]) {
        int ts = 0;  // Variable to count total subarrays
        int sumOfSubarrays = 0;  // Variable to store the sum of subarrays

        // Outer loop to choose the starting point of subarrays
        for (int i = 0; i < arr.length; i++) {

            // Middle loop to choose the ending point of subarrays
            for (int j = i; j < arr.length; j++) {

                // Inner loop to print the subarray and calculate its sum
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    ts++;  // Increment the total number of subarrays
                    sumOfSubarrays += arr[k];  // Add current element to sum
                }

                // Print the subarray and its sum
                System.out.println();
            }

            // Print the sum of all subarrays starting at index 'i'
            System.out.println("Sum of subarrays starting from index " + i + " is : " + sumOfSubarrays);
            System.out.println();

            // Reset the sum for the next starting index
            sumOfSubarrays = 0;
        }

        // Print the total number of subarrays found
        System.out.println("Total subarrays is : " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 43, 45, 2, 34 };
        subArrays(arr);
    }
}
