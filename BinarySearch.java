public class BinarySearch {

    public static void main(String[] args) {
        int numbers[] = {12, 24, 56, 76, 85, 87, 96};
        int key = 56;
        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }

    /**
     * This method performs a binary search on a sorted array.
     * 
     * Conditions for using Binary Search:
     * - The array must be sorted.
     * - The data structure should allow random access (like an array).
     * 
     * Time Complexity: 
     * - Best case: O(1) when the key is at the middle of the array.
     * - Average and Worst case: O(log n), where n is the number of elements in the array.
     * 
     * Space Complexity:
     * - O(1) as it uses a constant amount of extra space.
     *
     * @param arr The sorted array to search in.
     * @param key The value to search for in the array.
     * @return The index of the key if found; otherwise, -1.
     */
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Initialize mid
            int mid = start + (end - start) / 2; // Prevents potential overflow

            // Comparisons
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // Key not found
    }
}
