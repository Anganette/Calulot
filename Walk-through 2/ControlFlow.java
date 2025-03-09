import java.util.Scanner;
public class ControlFlow {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// If-Else Example
System.out.print("Enter your age: ");
int age = scanner.nextInt();
if (age >= 18) {
System.out.println("You are an adult.");
} else {
System.out.println("You are a minor.");
}

// Loop Example - Printing numbers 1 to 5
for (int i = 1; i <= 5; i++) {
System.out.println("Number: " + i);
}
scanner.close();
}
}
