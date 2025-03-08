package Jan31st_TaskProgram;

import java.util.Scanner;

public class Check_EligibleCritira {

    public static void main(String[] args){
            int Age, Credit_Card;
            Double salary = 0.0d;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Age");
            Age = sc.nextInt();
            System.out.println("Enter Salary");
            salary = sc.nextDouble();
            System.out.println("Enter Credit card");
            Credit_Card = sc.nextInt();

            if (Age > 0 && Age >= 18 && Age <= 80) {
                System.out.println("Person is eligable");
            } else {
                System.out.println("Not eligable");
            }

            if (salary > 0 && salary >= 30000) {

                System.out.println("valid salary");
            }
            else {
                System.out.println("Invalid salary");
            }
        if (Credit_Card > 0 && Credit_Card >= 650 && Credit_Card <= 850) {
            System.out.println("Valid credit card");
        } else {
            System.out.println("Invalid credit card");
        }
        }

        }



