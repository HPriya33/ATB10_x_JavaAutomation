package Java_Program30Jan;

import java.util.Scanner;

public class Check_CharAlphabet {

    public static void main(String[] args) {

        char ch='a';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                System.out.println("Entered char is Alphabet");
            }
        else
            {
                System.out.println("Entered char is not an Alphabet");
            }
        }
}
