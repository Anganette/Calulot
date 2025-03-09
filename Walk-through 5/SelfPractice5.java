import java.util.Scanner;

public class SelfPractice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Choose a Self-Practice Task:");
        System.out.println("1 - Check if a matrix is symmetric"); 
        System.out.println("2 - Transpose a matrix"); 
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //  1. Check if the matrix is symmetric
                boolean isSymmetric = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (matrix[i][j] != matrix[j][i]) {
                            isSymmetric = false;
                            break;
                        }
                    }
                }
                if (isSymmetric) {
                    System.out.println("The matrix is symmetric.");
                } else {
                    System.out.println("The matrix is NOT symmetric.");
                }
                break;

            case 2:
                // 2. Transpose a matrix
                int[][] transposedMatrix = new int[3][3];
                System.out.println("Transposed matrix:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        transposedMatrix[i][j] = matrix[j][i];
                        System.out.print(transposedMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
