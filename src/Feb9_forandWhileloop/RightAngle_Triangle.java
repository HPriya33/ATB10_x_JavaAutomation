package Feb9_forandWhileloop;

import java.util.Scanner;

public class RightAngle_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input height of the triangle
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for columns (printing '*')
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

    }
}
