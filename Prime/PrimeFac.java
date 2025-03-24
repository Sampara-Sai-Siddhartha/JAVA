import java.util.Scanner;

public class PrimeFac{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Prime factorization is not possible for numbers less than 2.");
        } else {
            System.out.println("Prime factors of " + number + " are: ");
            findPrimeFactors(number);
        }

        scanner.close();
    }

    // Function to find and print the prime factors of a number
    private static void findPrimeFactors(int n) {
        // Print 2 as a factor and divide the number by 2 until it is odd
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        // Check odd numbers as potential factors starting from 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n becomes a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
