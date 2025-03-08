import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Check if a number is even or odd (if-else)
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Show the name of the day using switch-case
        System.out.print("Enter a number (1-7) for a day of the week: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid number! Enter between 1-7.");
        }

        // Print numbers from 10 to 1 using while loop
        int count = 10;
        while (count >= 1) {
            System.out.println("Number: " + count);
            count--;
        }

        //  Keep asking for input until the user enters "exit"
        scanner.nextLine(); 
        String input;
        do {
            System.out.print("Type something (or type 'exit' to stop): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Program Ended.");

        scanner.close();
    }
}