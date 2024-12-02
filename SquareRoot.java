public class SquareRoot {
    public static double preciseSquareRoot(int n, int precision) {
        if (n < 0) throw new IllegalArgumentException("Square root of negative numbers is not real.");

        int low = 0, high = n;
        double result = 0.0;

        // Binary search for the integer part
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid == n) {
                return mid; // Perfect square
            } else if (mid * mid < n) {
                result = mid; // Update result
                low = mid + 1; // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }

        // Linear search for the fractional part
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (result * result <= n) {
                result += increment;
            }
            result -= increment; // Go back to the last valid value
            increment /= 10; // Decrease increment for higher precision
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 37; // Example input
        int precision = 4; // Precision up to 4 decimal places
        System.out.println("Square root of " + n + " is: " + preciseSquareRoot(n, precision));
    }
}
