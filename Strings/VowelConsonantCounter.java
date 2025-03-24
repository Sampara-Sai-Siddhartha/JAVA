// Java program to count Occurrence of Vowels & Consonants in a String. 
public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Check if the current character is a vowel
            if (isVowel(currentChar)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        // Display the results
        System.out.println("Input String: " + input);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "Hello, World!";
        countVowelsAndConsonants(inputString);
    }
}
