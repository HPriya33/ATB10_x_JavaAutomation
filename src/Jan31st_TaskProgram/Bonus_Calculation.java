package Jan31st_TaskProgram;

import java.util.Scanner;

public class Bonus_Calculation {
    public static double calculateBonus(double salary, int Exp) {
        double bonus = 0;

        if (Exp < 2) {
            bonus = 0; // No bonus
        } else if (Exp >= 2 && Exp <= 5) {
            bonus = salary * 0.05; // 5% bonus
        } else if (Exp >= 6 && Exp <= 10) {
            bonus = salary * 0.10; // 10% bonus
        } else {
            bonus = salary * 0.15; // 15% bonus
        }

        return bonus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Take experience input
        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();

        // Call function to calculate bonus
        double bonus = calculateBonus(salary, experience);

        // Display the result
        System.out.println("Your bonus amount is: Rs " + bonus);
    }
}