package Feb1TaskProgram;

import java.util.Scanner;

public class Age_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("❌ Invalid age! Age cannot be negative.");
        } else if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println( "Adult");
        } else {
            System.out.println( "Senior Citizen");
        }
    }
}
