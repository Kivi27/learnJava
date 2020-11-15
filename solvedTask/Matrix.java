import java.util.Scanner;

/*
    Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule. 
    Numbers 0 should be stored on the primary (main) diagonal. 
    The two diagonals, adjacent to the primary one, should contain numbers 1. 
    The next two diagonals should contain numbers 2; etc.
*/


class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = Math.abs(i - j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%1d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}