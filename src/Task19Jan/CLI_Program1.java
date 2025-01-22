package Task19Jan;

public class CLI_Program1 {
    public static void main(String[] args) {
        String name = args[0];                     // First argument is the name
        int age = Integer.parseInt(args[1]);       // Second argument is the age
        double salary = Double.parseDouble(args[2]); // Third argument is the salary

        // Print the collected data
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}
