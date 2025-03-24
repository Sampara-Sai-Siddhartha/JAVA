// Write a Java Program to remove all white spaces from a string without using replace(). 
public class RemoveWhitespace {

    public static String removeWhitespace(String input) {
        // Convert the string to a char array for easy manipulation
        char[] charArray = input.toCharArray();

        // Create a StringBuilder to store the result without white spaces
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the array
        for (char currentChar : charArray) {
            // Add the character to the result if it is not a white space
            if (!Character.isWhitespace(currentChar)) {
                resultBuilder.append(currentChar);
            }
        }

        // Convert the StringBuilder back to a String and return
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "  Hello,   World!  ";
        String result = removeWhitespace(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String without white spaces: " + result);
    }
}
