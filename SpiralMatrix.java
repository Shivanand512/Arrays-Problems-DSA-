import java.util.Scanner;

public class SpiralMatrix {

    public static int[] spiralMatrix(int[][] MATRIX) {
        // Write your code here.

        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int[] ans = new int[n * m];
        int top = 0, left = 0, right = m - 1, bottom = n - 1;
        int k = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                ans[k++] = MATRIX[top][i];
            top++;

            for (int i = top; i <= bottom; i++)
                ans[k++] = MATRIX[i][right];
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans[k++] = MATRIX[bottom][i];
                bottom--;

            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans[k++] = MATRIX[i][left];
                left++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with the specified dimensions
        int[][] matrix = new int[rows][columns];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Print the 2D array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] ans = spiralMatrix(matrix);
        System.out.println("The spiral matrix elements are:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

}
