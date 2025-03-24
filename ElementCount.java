import java.util.Scanner;

public class ElementCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: Get the element to count
        System.out.print("Enter the element to count: ");
        int element = scanner.nextInt();

        // Output: Count and display occurrences
        int occurrences = countOccurrences(array, element, 0);
        System.out.println("The number of occurrences of " + element + " in the array is: " + occurrences);

        scanner.close();
    }

    // Recursive method to count occurrences of an element in an array
    private static int countOccurrences(int[] array, int element, int index) {
        // Base case: if index reaches the end of the array
        if (index == array.length) {
            return 0;
        }

        // Check if the current element is equal to the target element
        int count = (array[index] == element) ? 1 : 0;

        // Recursive call for the rest of the array
        return count + countOccurrences(array, element, index + 1);
    }
}
