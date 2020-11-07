import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();
        chooseOperation(num1,operator,num2);
    }

    public static void chooseOperation(long a, String choose, long b) {
        switch(choose) {
            case "+":
                sumTwoNumbers(a,b);
                break;
            case "-":
                subtractTwoNumbers(a,b);
                break;
            case "/":
                divideTwoNumbers(a,b);
                break;
            case "*":
                multiplyTwoNumbers(a,b);
                break;
            default:
                System.out.println("invalid date");
        }
    }
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a-b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a+b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println((double) a / b);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    } 
}