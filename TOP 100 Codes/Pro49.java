import java.util.Scanner;

public class Pro49 {
    
    // Array to store words for single digits
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    
    // Array to store words for tens multiples
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Function to convert number to words
    private static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        if (num < 20) {
            return units[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " + units[num % 10] : "");
        }

        if (num < 1000) {
            return units[num / 100] + " Hundred" + ((num % 100 != 0) ? " and " + convertToWords(num % 100) : "");
        }

        if (num < 10000) {
            return units[num / 1000] + " Thousand" + ((num % 1000 != 0) ? " " + convertToWords(num % 1000) : "");
        }

        return "Number too large";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 9999: ");
        int num = scanner.nextInt();

        System.out.println("Number in words: " + convertToWords(num));
        scanner.close();
    }
}
