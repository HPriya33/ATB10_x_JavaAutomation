package Java_Program30Jan;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int no;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        no = sc.nextInt();

        if (no <= 1) {
            System.out.println("Not a prime number");
        } else if (no == 2) {
            System.out.println("Prime number");
        } else {
            // Step 3: Check divisibility
            boolean isPrime = true;
            for (int i = 2; i < no; i++) { // Loop from 2 to n-1
                if (no % i == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                    System.out.println("Prime number");
                } else {
                    System.out.println("Not a prime number");
                }
            }
        }
    }

