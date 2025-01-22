package Task19Jan;

public class Grade_Display {
    public static void main(String[] args) {
        int score = 92;
        char grade = (score >= 90 && score <= 100) ? 'A' : (score >= 80 && score <= 89) ? 'B' : (score >= 70 && score <= 79) ? 'C' :
                (score >= 60 && score <= 69) ? 'D' : (score >= 0 && score <= 59) ? 'F':'X';
              System.out.println("The letter grade for a score of  is: " + grade);

    }
}// Use nested ternary operators to determine the grade

