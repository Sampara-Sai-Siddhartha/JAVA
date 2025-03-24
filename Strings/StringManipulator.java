public class StringManipulator {

    public static String removeCharacter(String inputString, char charToRemove) {
        // Convert the string to a char array for easy manipulation
        char[] charArray = inputString.toCharArray();

        // Create a StringBuilder to store the result without the specified character
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the array
        for (char currentChar : charArray) {
            // Add the character to the result if it is not the one to be removed
            if (currentChar != charToRemove) {
                resultBuilder.append(currentChar);
            }
        }

        // Convert the StringBuilder back to a String and return
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "Hello, World!";
        char charToRemove = 'o';

        String result = removeCharacter(input, charToRemove);

        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }
}
