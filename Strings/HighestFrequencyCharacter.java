// Java program to print the highest frequency character in a String. 
import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyCharacter {

    public static char findHighestFrequencyChar(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Update the frequency in the map
            charFrequencyMap.put(currentChar, charFrequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        // Find the character with the highest frequency
        char highestFrequencyChar = ' ';
        int highestFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                highestFrequencyChar = entry.getKey();
            }
        }

        return highestFrequencyChar;
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "programming is interesting";
        char highestFrequencyChar = findHighestFrequencyChar(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Highest frequency character: " + highestFrequencyChar);
    }
}
