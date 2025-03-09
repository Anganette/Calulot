import java.util.Arrays;
import java.util.HashSet;

public class SelfPractice3 {
    public static void main(String[] args) {
        // 1. Merging two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        // 2. Removing duplicates from an array
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Array without duplicates: " + uniqueNumbers);
    }
}
