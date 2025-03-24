// Write a program in Java for, In array 1-100 numbers are stored, one number is missing how do you find it. 
import java.util.Arrays;
public class FindMissingNumber {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Number of elements (including the missing one)
        int expectedSum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arrayWithMissingNumber = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Missing number: 5
        int missingNumber = findMissingNumber(arrayWithMissingNumber);

        System.out.println("Array with missing number: " + Arrays.toString(arrayWithMissingNumber));
        System.out.println("Missing number: " + missingNumber);
    }
}
