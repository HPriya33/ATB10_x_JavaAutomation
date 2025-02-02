package Java_Program30Jan;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        year=sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("This"+year+"is Leap Year");
        }
        else {
            System.out.println("This "+year+"is Not a Leap Year");
        }

    }
}
