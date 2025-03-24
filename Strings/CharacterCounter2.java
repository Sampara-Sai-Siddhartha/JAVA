// Java program to count alphabets, digits and special characters
public class CharacterCounter2 {

    public static void countCharacters(String input) {
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Check if the current character is an alphabet
            if (Character.isLetter(currentChar)) {
                alphabetCount++;
            }
            // Check if the current character is a digit
            else if (Character.isDigit(currentChar)) {
                digitCount++;
            }
            // The character is not an alphabet or digit, so it is a special character
            else {
                specialCharCount++;
            }
        }

        // Display the results
        System.out.println("Input String: " + input);
        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Number of Special Characters: " + specialCharCount);
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "Hello123, World!";
        countCharacters(inputString);
    }
}
