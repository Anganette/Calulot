public class GuidedTasks3 {
    public static void main(String[] args) {
        // 1. Array of 5 student grades and average calculation
        int[] grades = {81, 95, 77, 89, 93};
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Average Grade: " + average);

        // 2. Maximum and minimum value in an array
        int max = grades[0];
        int min = grades[0];
        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);

        // 3. Reverse an array using a loop
        System.out.print("Reversed Array: ");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(grades[i] + " ");
        }
    }
}
