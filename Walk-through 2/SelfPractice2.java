import java.util.Scanner;
import java.util.Random;

public class SelfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Guessing game where the user has to guess a random number
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1;
        int guess;
        
        System.out.println("Guess the number (1-10): ");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != targetNumber);
        System.out.println("Congratulations! You guessed the correct number.");

        // 2. Do-while loop that keeps asking for input until "exit" is entered
        scanner.nextLine();
        String input;
        do {
            System.out.print("Enter a command (type 'exit' to stop): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));
        System.out.println("Program terminated.");

        scanner.close();
    }
}  