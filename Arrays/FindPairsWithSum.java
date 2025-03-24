// Write a program in Java for, How to find all pairs in array of integers whose sum is equal to given number. 
public class FindPairsWithSum {

    public static void findPairs(int[] arr, int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {2, 7, 4, 5, 11, 15};
        int targetSum = 9;

        findPairs(array, targetSum);
    }
}

