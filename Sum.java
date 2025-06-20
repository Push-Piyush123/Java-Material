class Addition {
    int num1, num2;

    // Parameterized constructor
    Addition(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void displaySum() {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}

public class Sum {
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20);
        obj.displaySum();
    }
}
