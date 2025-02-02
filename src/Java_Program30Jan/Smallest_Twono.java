package Java_Program30Jan;

import java.util.Scanner;

public class Smallest_Twono {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        num1=sc.nextInt();
        System.out.println("Enter Number2");
        num2=sc.nextInt();
        if(num1<num2)
        {
            System.out.println("Number1 is smallest no");
        }
        else
        {
            System.out.println("Number2 is smallest");
        }
    }
}
