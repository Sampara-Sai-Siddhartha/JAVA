// Write a program in Java for, Ina array 1-100 multiple numbers are duplicates, how do you find it.
public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate numbers in the array:");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;  // Uncomment this line if you want to print each duplicate only once
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 6, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        findDuplicates(arrayWithDuplicates);
    }
}
