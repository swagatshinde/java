import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMatrix Operations Menu");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performAddition(sc);
                    break;
                case 2:
                    performMultiplication(sc);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }

    // Function to input a matrix
    static int[][] inputMatrix(Scanner sc, String name) {
        System.out.print("Enter number of rows for " + name + ": ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for " + name + ": ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Function to perform matrix addition
    static void performAddition(Scanner sc) {
        int[][] A = inputMatrix(sc, "Matrix A");
        int[][] B = inputMatrix(sc, "Matrix B");

        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Addition not possible. Matrices must be of same dimensions.");
            return;
        }

        int[][] sum = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Result of Addition:");
        printMatrix(sum);
    }

    // Function to perform matrix multiplication
    static void performMultiplication(Scanner sc) {
        int[][] A = inputMatrix(sc, "Matrix A");
        int[][] B = inputMatrix(sc, "Matrix B");

        if (A[0].length != B.length) {
            System.out.println("Multiplication not possible. Columns of A must equal rows of B.");
            return;
        }

        int[][] product = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result of Multiplication:");
        printMatrix(product);
    }

    // Function to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
