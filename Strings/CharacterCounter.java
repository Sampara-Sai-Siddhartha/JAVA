// Write a program in Java to count occurrence of a given character in a String. 
public class CharacterCounter {

    public static int countOccurrences(String input, char targetChar) {
        int count = 0;

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Check if the current character is equal to the target character
            if (currentChar == targetChar) {
                count++;
            }
        }

        // Return the count of occurrences
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "programming is fun";
        char targetCharacter = 'g';

        int occurrences = countOccurrences(inputString, targetCharacter);

        System.out.println("Input String: " + inputString);
        System.out.println("Occurrences of '" + targetCharacter + "': " + occurrences);
    }
}
