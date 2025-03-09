import java.time.LocalDateTime;
import java.util.Scanner;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Modify code to take user input for name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // 2. Print current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        scanner.close();
    }
}
