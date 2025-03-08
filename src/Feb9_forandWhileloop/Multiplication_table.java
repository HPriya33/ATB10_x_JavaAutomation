package Feb9_forandWhileloop;

import java.util.Scanner;

public class Multiplication_table {



    public static void printTableForLoop(int number) {
        System.out.println("Multiplication Table of " + number + " using For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Function to print multiplication table using while loop
    public static void printTableWhileLoop(int number) {
        System.out.println("Multiplication Table of " + number + " using While Loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();
        System.out.println("Multiplication:: " + number + ":");
        printTableForLoop(number);
        printTableWhileLoop(number);




    }
}
