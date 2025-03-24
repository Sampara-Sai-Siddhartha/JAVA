// Java program to convert lowercase char to uppercase of string. 
public class LowerToUpperConverter {

    public static String convertToLowerToUpper(String input) {
        char[] charArray = input.toCharArray();

        // Iterate through each character in the array
        for (int i = 0; i < charArray.length; i++) {
            // Check if the character is a lowercase letter
            if (Character.isLowerCase(charArray[i])) {
                // Convert the lowercase letter to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Convert the char array back to a String and return
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "Hello, World!";
        String result = convertToLowerToUpper(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String with lowercase letters converted to uppercase: " + result);
    }
}
