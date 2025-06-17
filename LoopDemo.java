public class LoopDemo {
    public static void main(String[] args) {

        // 1. if-else example
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 2. while loop example
        int i = 1;
        System.out.println("\nWhile Loop:");
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }

        // 3. do-while loop example
        int j = 1;
        System.out.println("\nDo-While Loop:");
        do {
            System.out.println("Count: " + j);
            j++;
        } while (j <= 5);

        // 4. for loop example
        System.out.println("\nFor Loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Count: " + k);
        }
    }
}
