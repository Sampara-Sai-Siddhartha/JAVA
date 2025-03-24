// Java Program to remove repeated character from string. 
import java.util.HashSet;
public class RemoveRepeatedCharacters {

    public static String removeRepeatedChars(String input) {
        StringBuilder resultBuilder = new StringBuilder();

        // Create a set to keep track of unique characters
        HashSet<Character> uniqueChars = new HashSet<>();

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Add the character to the result if it is not already in the set
            if (uniqueChars.add(currentChar)) {
                resultBuilder.append(currentChar);
            }
        }

        // Convert the StringBuilder back to a String and return
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "programming";
        String result = removeRepeatedChars(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing repeated characters: " + result);
    }
}
