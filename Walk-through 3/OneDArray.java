public class OneDArray {
public static void main(String[] args) {
int[] numbers = {10, 20, 30, 40, 50};

// Printing array elements
System.out.println("Array Elements:");
for (int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i]);
}

// Updating an element
numbers[2] = 99;
System.out.println("Updated Third Element: " + numbers[2]);
}
}
