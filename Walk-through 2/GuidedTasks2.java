import java.util.Scanner;

public class GuidedTasks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Check if a number is even or odd
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 2. Switch-case to display the day of the week
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid day"; break;
        }
        System.out.println("Day: " + dayName);

        // 3. While loop to print numbers from 10 to 1
        int i = 10;
        while (i >= 1) {
            System.out.println("Number: " + i);
            i--;
        }

        scanner.close();
    }
}
