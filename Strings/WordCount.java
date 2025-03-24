public class WordCount {

    public static int countWords(String input) {
        // Remove leading and trailing whitespaces
        input = input.trim();

        // Check if the input is an empty string
        if (input.isEmpty()) {
            return 0;
        }

        // Split the string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Return the count of words
        return words.length;
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "  This is a sample sentence with seven words.   ";
        int wordCount = countWords(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Number of words: " + wordCount);
    }
}
