package Feb1TaskProgram;

import java.util.Scanner;

public class Check_Numberdivisible {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        if(num%3==0&&num%3==0)
        {
            System.out.println(+num + "Number is divisible by both 3 & 5 ");
        }
        else
        {
            System.out.println(+num + "Number is not divisible by both 3 & 5" );
        }

    }
}
