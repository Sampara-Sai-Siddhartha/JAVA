public class StringReversal {

    public static String reverseString(String input) {
        // Convert the string to a char array for easy manipulation
        char[] charArray = input.toCharArray();

        // Calculate the midpoint of the array
        int mid = charArray.length / 2;

        // Swap characters from the beginning with corresponding characters from the end
        for (int i = 0; i < mid; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        // Convert the char array back to a String
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
