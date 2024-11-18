import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows of Pascal's Triangle
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces to align the triangle
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the values in the current row
            int value = 1;  // First value in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);  // Update value for the next number in the row
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}