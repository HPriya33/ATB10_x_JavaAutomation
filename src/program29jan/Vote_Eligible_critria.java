package program29jan;

import java.util.Scanner;

public class Vote_Eligible_critria {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Person is eligible for voting ");
        }
        else {
            System.out.println("Person is not eligible for vote");
        }

    }
}
