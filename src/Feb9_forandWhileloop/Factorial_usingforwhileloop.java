package Feb9_forandWhileloop;

import java.util.Scanner;

public class Factorial_usingforwhileloop {

        public static long factorialForLoop(int number) {
            long factorial = 1; // Factorial starts at 1
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;

            }
            return factorial;
        }
        // Function to calculate factorial using while loop
        public static long factorialWhileLoop(int number) {
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            return factorial;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int number = scanner.nextInt();
        long resultForLoop = factorialForLoop(number);
        long resultWhileLoop = factorialWhileLoop(number);


        System.out.println("Factorial of " + number + " using For Loop: " + resultForLoop);
        System.out.println("Factorial of " + number + " using While Loop: " + resultWhileLoop);

    }
}
