public class LinearSearch {
    public static void main(String[] args) {
        int number[] = { 10, 20, 45, 65, 78, 98 };
        int key = 65;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    /**
     * This method performs a linear search on the given array.
     * Linear search algorithm iterates through each element of the array
     * and compares it with the key. If the key is found, it returns the index
     * of the element; otherwise, it returns -1.
     *
     * Time Complexity:
     * - Best case: O(1) when the key is found at the first position.
     * - Average case: O(n) where n is the number of elements in the array.
     * - Worst case: O(n) when the key is not present in the array or is at the last position.
     *
     * Space Complexity:
     * - O(1) since it uses a constant amount of extra space.
     *
     * @param number The array in which to search for the key.
     * @param key The value to search for in the array.
     * @return The index of the key if found; otherwise, -1.
     */
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
