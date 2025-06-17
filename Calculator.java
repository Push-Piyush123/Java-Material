public class Calculator {

    // Function to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Function to subtract two numbers
    static int subtract(int a, int b) {
        return a - b;
    }

    // Function to multiply two numbers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Function to divide two numbers
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}
