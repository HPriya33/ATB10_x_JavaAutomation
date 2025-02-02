package Java_Program30Jan;

import java.util.Scanner;

public class Largest_Threeno {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        num1=sc.nextInt();
        System.out.println("Enter Number2");
        num2=sc.nextInt();
        System.out.println("Enter Number3");
        num3=sc.nextInt();
        if(num1>num2 &&num2>num3)
        {
            System.out.println("Num1 is largest");
        } else if (num2>num1 &&num2>num3) {
            System.out.println("Number2 is largest");
        }
        else {
            System.out.println("Number3 is largest");
        }
    }
}
