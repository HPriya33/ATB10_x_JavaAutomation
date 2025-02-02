package Java_Program30Jan;

import java.util.Scanner;

public class Check_Grade {
    public static void main(String[] args) {
        int per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        per=sc.nextInt();
        if(per>=90&&per<=100)
        {
            System.out.println("GradeA");
        }
        else if (per>=80&&per<=89) {
            System.out.println("GradeB");

        }
        else if (per>=70&&per<=79) {
            System.out.println("GradeC");

        }
        else if (per>=60&&per<=69) {
            System.out.println("GradeD");

        }
        else if (per>=50&&per<=59) {
            System.out.println("GradeE");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
