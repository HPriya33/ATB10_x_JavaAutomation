package Feb1TaskProgram;

import java.util.Scanner;

public class GetDays_Validation {
    public static void main(String[] args) {
        int totaldays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        totaldays = sc.nextInt();
        int years = totaldays / 365;  // Get years from the input
        int remainingDays = totaldays % 365;  // Remaining days after years
        int months = remainingDays / 30;  // Get months
        int days = remainingDays % 30;  // Remaining days after months
        System.out.println(totaldays + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }
    }

