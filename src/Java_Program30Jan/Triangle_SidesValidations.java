package Java_Program30Jan;

import java.util.Scanner;

public class Triangle_SidesValidations {
    public static void main(String[] args) {
        float side1,side2,side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side");
        side1=sc.nextFloat();
                System.out.println("Enter second side");
        side2=sc.nextFloat();
        System.out.println("Enter third side");
        side3=sc.nextFloat();
        if(side1>0&&side2>0&&side3>0) {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("all sides are same and valid sides");
            }
            else {
                System.out.println("Not valid or same side");
            }
        }

    }
}
