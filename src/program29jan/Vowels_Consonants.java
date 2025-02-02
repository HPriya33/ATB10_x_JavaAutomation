package program29jan;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
char ch='a';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Character is Vowels");
        }
        else {
            System.out.println("Character is consonants");
        }
    }
}
