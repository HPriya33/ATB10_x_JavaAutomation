package program29jan;

import java.util.Scanner;

public class PositiveNegative_Number {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println("number is negative");
        } else if (a>0)
        {
        System.out.println("Number is positive");
        }
        else {
            System.out.println("number is zero");
        }
    }
}
