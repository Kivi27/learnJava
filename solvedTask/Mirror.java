/*
Given a four-digit number.
Determine whether its decimal notation is symmetric.
If the number is symmetric, output 1; 
otherwise output any other integer.
*/
import java.util.Scanner;

class Mirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number % 10 == number /  1000) && (number / 10 % 10 == number / 100 % 10)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}
