// Java program to remove blank space from string.
public class RemoveWhitespace2 {

    public static String removeWhiteSpace(String input) {
        // Remove all white spaces using regular expression
        return input.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "  Hello,   World!  ";
        String result = removeWhiteSpace(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing white spaces: " + result);
    }
}
