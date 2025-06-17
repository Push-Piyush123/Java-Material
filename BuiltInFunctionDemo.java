import java.util.Arrays;

public class BuiltInFunctionDemo {

    public static void main(String[] args) {

        // -------- 1. Math Functions --------
        System.out.println("🔢 Math Functions:");
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2 raised to power 3: " + Math.pow(2, 3));
        System.out.println("Absolute of -7: " + Math.abs(-7));
        System.out.println("Random number (0.0 to 1.0): " + Math.random());

        // Extra math: sin example
        double radians = Math.toRadians(30);
        System.out.println("Sine of 30°: " + Math.sin(radians));
        System.out.println();

        // -------- 2. String Functions --------
        String str = "Hello, World!";
        System.out.println("📝 String Functions:");
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Char at index 0: " + str.charAt(0));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Contains 'lo': " + str.contains("lo"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Substring (0,5): " + str.substring(0, 5));
        System.out.println("Index of ',' : " + str.indexOf(','));
        System.out.println();

        // -------- 3. Array Functions --------
        System.out.println("📦 Array Functions:");
        int[] arr = {3, 5, 1, 4};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4 after sorting: " + index);
        System.out.println();

        // -------- 4. Character Functions --------
        System.out.println("🔤 Character Functions:");
        char ch1 = '5';
        char ch2 = 'A';
        char ch3 = 'a';

        System.out.println("Is '" + ch1 + "' a digit? " + Character.isDigit(ch1));
        System.out.println("Is '" + ch2 + "' a letter? " + Character.isLetter(ch2));
        System.out.println("Uppercase of '" + ch3 + "': " + Character.toUpperCase(ch3));
    }
}
