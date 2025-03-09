import java.time.LocalDate;
import java.time.LocalDateTime; // Import LocalDateTime
import java.util.Scanner;

public class GuidedTasks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declare a variable for name and print a greeting message
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome .");

        // 2. Calculate the area of a rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        // 3. Date & Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Today's Date & Time: " + currentDateTime);

        scanner.close();
    }
}
