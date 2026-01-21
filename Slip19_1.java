package Slip1;

import java.util.Scanner;

public class Slip19_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            if (i != n - 1 - i) {
                sum += arr[i][n - 1 - i];
            }
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}
