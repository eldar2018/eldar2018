
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumber;
        String userAnswer;

        System.out.println("First player input your name, please.");
        String namePlayerOne = scan.next();

        System.out.println("Second player input your name, please.");
        String namePlayerTwo = scan.next();

        int randomNumber = (int) (Math.random() * 100 + 1);

        do {
            System.out.println("Try guess number!!!");
            System.out.println("First player inputs his number first");

            do {
                System.out.println(namePlayerOne + ", please, try to guess the number: ");
                userNumber = scan.nextInt();

                if (userNumber == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(namePlayerTwo + " wins!!");
                    break;
                } else if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }
                System.out.println(namePlayerTwo + " tries to guess the number: ");
                userNumber = scan.nextInt();

                if (userNumber == randomNumber) {
                    System.out.println("Well done!!");
                    System.out.println(namePlayerTwo + " wins!!");
                } else if (userNumber > randomNumber) {
                    System.out.println("The number is smaller.");
                } else {
                    System.out.println("The number is larger.");
                }
            } while (userNumber != randomNumber);

            System.out.println("Do you want to continue?[yes/no]");
            userAnswer = scan.next();
            if (userAnswer.equals("yes")) {
                System.out.println("Let's play again!!!");
            } else if (userAnswer.equals("no")) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Error!!");
            }
        } while (userAnswer.equals("yes"));
    }
}
