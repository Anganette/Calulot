import java.util.Scanner;
import java.time.LocalDateTime;

public class BasicSyntax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for name and age
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying a greeting message
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Length & width of the rectangle 
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        // Displaying current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        scanner.close();
    }
}