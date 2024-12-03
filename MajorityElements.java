import java.util.List;
import java.util.ArrayList;

public class MajorityElements {

    /**
     * This method finds all elements in the array that appear more than n/3 times.
     * Approach: Boyer-Moore Voting Algorithm (extended for two candidates).
     *
     * @param nums The input array of integers.
     * @return A list of integers that appear more than n/3 times.
     */
    public static List<Integer> findMajorityElements(int[] nums) {
        // Variables to store potential majority candidates and their counts
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        // Step 1: Find potential candidates for majority elements
        // Loop through the array to determine two candidates that might be the majority
        for (int num : nums) {
            if (candidate1 == num) {
                count1++; // Increment count for candidate1
            } else if (candidate2 == num) {
                count2++; // Increment count for candidate2
            } else if (count1 == 0) {
                candidate1 = num; // Update candidate1
                count1 = 1; // Reset count for candidate1
            } else if (count2 == 0) {
                candidate2 = num; // Update candidate2
                count2 = 1; // Reset count for candidate2
            } else {
                // Decrease counts for both candidates as no match found
                count1--;
                count2--;
            }
        }

        // Reset counts for the validation step
        count1 = 0;
        count2 = 0;

        // Step 2: Validate candidates by counting their occurrences
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            if (num == candidate2) {
                count2++;
            }
        }

        // Step 3: Check if the candidates satisfy the majority condition (> n/3)
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        // Ensure candidate2 is not the same as candidate1
        if (candidate2 != candidate1 && count2 > n / 3) {
            result.add(candidate2);
        }

        result.sort(null);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 5, 5, 4, 4, 5, 4, 4 };

        System.out.println("Majority Elements: " + findMajorityElements(nums));
    }
}
