import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division, 5 for Modulus, or 0 to Exit:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    int add1 = scanner.nextInt();
                    int add2 = scanner.nextInt();
                    System.out.println("Result: " + add(add1, add2));
                    break;

                case 2:
                    System.out.println("Enter two numbers:");
                    int sub1 = scanner.nextInt();
                    int sub2 = scanner.nextInt();
                    System.out.println("Result: " + subtract(sub1, sub2));
                    break;

                case 3:
                    System.out.println("Enter two numbers:");
                    int mul1 = scanner.nextInt();
                    int mul2 = scanner.nextInt();
                    System.out.println("Result: " + multiply(mul1, mul2));
                    break;

                case 4:
                    System.out.println("Enter two numbers:");
                    int div1 = scanner.nextInt();
                    int div2 = scanner.nextInt();
                    System.out.println("Result: " + divide(div1, div2));
                    break;

                case 5:
                    System.out.println("Enter two numbers:");
                    int mod1 = scanner.nextInt();
                    int mod2 = scanner.nextInt();
                    System.out.println("Result: " + modulus(mod1, mod2));
                    break;

                case 0:
                    System.out.println("Exiting from the calculator...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}