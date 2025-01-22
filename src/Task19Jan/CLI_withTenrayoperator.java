package Task19Jan;

public class CLI_withTenrayoperator {
    public static void main(String[] args) {
                      // First argument is the name
        int num1 = Integer.parseInt(args[0]); // First number
        int num2 = Integer.parseInt(args[1]); // Second number

        // Use the ternary operator to find the maximum
        int maximumno = (num1 > num2) ? num1 : num2;

        // Print the result
        System.out.println("The maximum number between is: " + maximumno);


    }
}
