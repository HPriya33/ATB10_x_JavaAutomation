package program29jan;

import java.util.Scanner;

public class FizzBuzz_Numbers {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        if(num%3==0&&num%5==0)
        {
            System.out.println("FizzBuzz");
        } else if (num%5==0)
        {
            System.out.println("Buzz");
        }
        else if(num%3==0)
        {
            System.out.println("Fizz");
        }
        else {
            System.out.println("Number is not in criteria");
        }
    }
}
