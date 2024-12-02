
public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        // step 1 : inilize two variable largest and smallest
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // handle edge cases if array length is 1
            if(arr.length == 1) return -1;
            if (arr[i] > largest) {
                // first update the secondlargest
                secondLargest = largest;
                // now update the largest
                largest = arr[i];
            }
            // if a element is greater than the second largest but less than the largest
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 35, 34, 12, 8, -1, -4 };
        int[] arr2 = {1};
        System.out.println("The second largest number in the array is: " + findSecondLargest(arr2));
    }
}
