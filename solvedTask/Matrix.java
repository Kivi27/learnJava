import java.util.Scanner;

/*
    Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule. 
    Numbers 0 should be stored on the primary (main) diagonal. 
    The two diagonals, adjacent to the primary one, should contain numbers 1. 
    The next two diagonals should contain numbers 2; etc.
*/


class Matrix {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int[][] array = new int[size][size];        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               if (i == j) {
                   array[i][j] = 0;
               } else if (j > i) {
                   array[i][j] = j - i;
               } else {
                   array[i][j] = i - j;
               }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}