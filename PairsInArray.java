public class PairsInArray {

    // Function to print all pairs in the array
    public static void pairsInArr(int numbers[]) {
        // Outer loop to iterate through each element
        int tp=0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // Current element for the pair
            // Inner loop to pair the current element with each subsequent element
            for (int j = i + 1; j < numbers.length; j++) {
                // Print the pair
                System.out.print("(" + current + "," + numbers[j] + ") ");
                tp++;
                

            }
            // Print a new line after each row of pairs
            System.out.println();

        }
        System.out.println("total pairs is : "+tp);

    }

    public static void main(String[] args) {
        int numbers[] = { 12, 34, 21, 3, 6 }; // Example array

        // Print all pairs in the array
        pairsInArr(numbers);
    }
}
