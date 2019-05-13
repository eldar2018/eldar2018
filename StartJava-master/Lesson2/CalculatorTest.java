
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userAnswer;
        Calculator calculator = new Calculator();
        do {

            System.out.print("Input number: ");
            int number1 = input.nextInt();
            

            System.out.print("Choose operation (+, -, *, /, ^, %): ");
            char operation = input.next().charAt(0);

            System.out.print("Input number: ");
            int number2 = input.nextInt();

            int result = calculator.calculate(number1, number2, operation);
            System.out.println("Result: " + result);

            do {    
                System.out.println("Do you want to continue?[yes/no]");
                userAnswer = input.next();
                if (userAnswer.equals("yes")) {
                    System.out.println("Input a math expression again.");
                } else if (userAnswer.equals("no")) {
                    System.out.println("Bye");
                    break;
                } else {
                    System.out.println("Error!!");
                }
            } while (!userAnswer.equals("yes"));
        } while (!userAnswer.equals("no"));
    }
}
