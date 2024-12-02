public class PascalsTraingle {
    public static void main(String[] args) {
        int numRows = 5; // number of row's in pascals triangle
        int[][] pascals = new int[numRows][numRows];

        // generate pascals traingle
        for (int i = 0; i < numRows; i++) {
            pascals[i][0] = 1; // 1st element of each row is 1
            pascals[i][i] = 1; // last element of each row is 1

            for (int j = 1; j < i; j++) {
                pascals[i][j] = pascals[i - 1][j - 1] + pascals[i - 1][j];

            }
        }

        // print 2d array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascals[i][j] + " ");
            }
            System.out.println("");
        }
    }
}