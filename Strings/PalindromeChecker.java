public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        return isPalindromeHelper(cleanStr);
    }

    public static boolean isPalindrome(int num) {
        // Convert the number to a string and check if the string is a palindrome
        return isPalindrome(String.valueOf(num));
    }

    private static boolean isPalindromeHelper(String str) {
        // Use two pointers to compare characters from the beginning and end
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage for strings
        String strPalindrome = "A man, a plan, a canal, Panama!";
        System.out.println("Is \"" + strPalindrome + "\" a palindrome? " + isPalindrome(strPalindrome));

        String strNotPalindrome = "Hello, World!";
        System.out.println("Is \"" + strNotPalindrome + "\" a palindrome? " + isPalindrome(strNotPalindrome));

        // Example usage for numbers
        int numPalindrome = 12321;
        System.out.println("Is " + numPalindrome + " a palindrome? " + isPalindrome(numPalindrome));

        int numNotPalindrome = 12345;
        System.out.println("Is " + numNotPalindrome + " a palindrome? " + isPalindrome(numNotPalindrome));
    }
}
