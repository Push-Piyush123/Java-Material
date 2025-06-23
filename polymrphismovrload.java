public class polymrphismovrload {
     // Method with int parameters
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method with double parameters
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method with float parameters
    public float multiply(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        polymrphismovrload obj = new polymrphismovrload();

        // int version
        System.out.println("Int Multiply: " + obj.multiply(4, 5));

        // double version
        System.out.println("Double Multiply: " + obj.multiply(4.5, 2.0));

        // float version (need 'f' suffix for float)
        System.out.println("Float Multiply: " + obj.multiply(3.5f, 2.5f));
    }
}
    

