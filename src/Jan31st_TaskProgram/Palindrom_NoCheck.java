package Jan31st_TaskProgram;

import java.util.Scanner;

public class Palindrom_NoCheck {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        int original=num;
        int Reversed=0;
        while(num>0)

        {
            int value=num%10;//*Extract the last digit by using mod
            Reversed=Reversed*10+value;//Add the value into then Reversed value
            num=num/10;//Divid the values


        }
        if(original==Reversed)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}
