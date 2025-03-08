package Jan31st_TaskProgram;

import java.util.Scanner;

public class Armstron_value
{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        int original=num;//For comparsion purpose assign the input value to one variable
        int sum=0;//Decalre one variable sum to store the sum
        while(num>0)
        {
            int value=num%10;//Extract the no
            int cubevale=value*value*value;//Sum of exctarted vale means cube of extracted vale
            sum=sum+cubevale;//Add the cube value into the sum varaible
            num=num/10;

        }
        if(sum==original)
        {
            System.out.println("Armstrong no");
        }
        else
        {
            System.out.println("Not armstrong");
        }
    }
}
