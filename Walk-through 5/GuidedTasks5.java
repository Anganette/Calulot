import java.util.Scanner;

public class GuidedTasks5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Choose a Guided Task:");
        System.out.println("1 - Find the sum of all elements in the matrix"); 
        System.out.println("2 - Add two matrices"); 
        System.out.println("3 - Perform matrix multiplication"); 
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //  1. Find the sum of all elements in the matrix
                int sum = 0;
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        sum += matrix1[i][j];
                    }
                }
                System.out.println("Sum of all elements: " + sum);
                break;

            case 2:
                //  2. Add two matrices
                int[][] sumMatrix = new int[3][3];
                System.out.println("Sum of matrices:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(sumMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                //  3. Matrix multiplication
                int[][] productMatrix = new int[3][3];
                System.out.println("Product of matrices:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        productMatrix[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                        System.out.print(productMatrix[i][j] + " ");
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
