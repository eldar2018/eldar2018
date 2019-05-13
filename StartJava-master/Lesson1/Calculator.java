import java.util.Scanner; 

public class Calculator {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
            
        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.print("Choose operation (+, -, *, /, ^, %): ");
        char operation = input.next().charAt(0);

        System.out.print("Input second number: ");
        int number2 = input.nextInt();
        
        if (operation == '+') {
            System.out.println(number1 + number2);
        } else if (operation == '-') {
            System.out.println(number1 - number2);
        } else if (operation == '*') {
            System.out.println(number1 * number2);
        } else if (operation == '/') {
            System.out.println(number1 / number2); 
        } else if (operation == '%') {
            System.out.println(number1 % number2);
        } else if (operation == '^') {
            int count = 1;
            int degree = number1;
            while (count != number2) {
                degree = degree * number1;
                count++;
            }
            System.out.println(degree);
        } else {
            System.out.println("Error!!");
        }       		
    }
}
