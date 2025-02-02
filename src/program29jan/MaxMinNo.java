package program29jan;

import java.util.Scanner;

public class MaxMinNo {
    public static void main(String[] args) {

        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        num1=sc.nextInt();
        System.out.println("Enter Number2");
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Num1 is Maximum Number");
        }
        else {
            System.out.println("Num1 is Minimum Number");
        }

    }

}
