public class onedarray {
    public static void main(String[] args) {
        // Array to store temperatures of 7 days
        int[] temperatures = {32, 34, 31, 33, 35, 30, 36};

        // Print temperatures
        System.out.println("Daily Temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
     }
}