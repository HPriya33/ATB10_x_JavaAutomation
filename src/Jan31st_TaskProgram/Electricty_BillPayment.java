package Jan31st_TaskProgram;

import java.util.Scanner;

public class Electricty_BillPayment {
    public static double calculateBill(int units) {
        double BillAmount = 0;

        if (units <= 100) {
            BillAmount = units * 0.50;
        } else if (units <= 200) {
            BillAmount = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            BillAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            BillAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }
        return BillAmount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units : ");
        int units = sc.nextInt();
        double bill = calculateBill(units);
          System.out.println("Electricity Bill: Rs " + bill);
    }
}
