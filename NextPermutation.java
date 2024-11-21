public class NextPermutation {

    /**
     * This method finds the next lexicographical permutation of the given array of
     * integers.
     * If no such permutation exists (array is in descending order), it rearranges
     * to the smallest permutation (ascending order).
     * 
     */
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the breakpoint (rightmost element smaller than its next)
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i; // Record the index of the breakpoint
                break;
            }
        }

        // Step 2: If no breakpoint is found, the array is in descending order. Reverse
        // it to get the smallest permutation.
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest element greater than nums[idx] from the right
        // (successor)
        int successor = -1;
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                successor = i;
                break;
            }
        }

        // Step 4: Swap the breakpoint element with its successor
        swap(nums, idx, successor);

        // Step 5: Reverse the elements to the right of the breakpoint to get the next
        // permutation
        reverse(nums, idx + 1, n - 1);
    }

    // Reverses the elements in the given array between the start and end indices.

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Swaps two elements in the array.
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 }; // Example input
        nextPermutation(nums);

        // Print the output
        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
