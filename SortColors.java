public class SortColors {

    /**
     * Sorts an array of integers (0, 1, 2) in-place using the Dutch National Flag Algorithm.
     * 
     * Approach:
     * - Use three pointers: low, mid, and high.
     * - low points to the boundary of 0s.
     * - mid scans the array.
     * - high points to the boundary of 2s.
     * 
     * Algorithm:
     * 1. Initialize pointers: low = 0, mid = 0, high = nums.length - 1.
     * 2. While mid <= high:
     *    a. If nums[mid] == 0, swap nums[low] and nums[mid], increment both low and mid.
     *    b. If nums[mid] == 1, just increment mid.
     *    c. If nums[mid] == 2, swap nums[mid] and nums[high], decrement high.
     * 
     * Time Complexity: O(n) - The array is traversed once.
     * Space Complexity: O(1) - In-place sorting.
     */

    public static void dutchAlgo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Traverse until mid crosses high
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid], then increment both low and mid
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    // No swap needed, just increment mid
                    mid++;
                    break;

                case 2:
                    // Swap nums[mid] and nums[high], decrement high
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 0, 2, 1, 1, 0, 2 };

        // Print array before sorting
        System.out.println("Before using Dutch Algorithm:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Apply Dutch National Flag Algorithm
        dutchAlgo(nums);

        // Print array after sorting
        System.out.println("\nAfter using Dutch Algorithm:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
