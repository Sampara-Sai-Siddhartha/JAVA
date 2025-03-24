// Java program to check given character is digit or not
public class DigitChecker {

    public static void main(String[] args) {
        char ch = '7'; // Change this character to test different cases

        // Using Character.isDigit() method to check if the character is a digit
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is not a digit.");
        }
    }
}
