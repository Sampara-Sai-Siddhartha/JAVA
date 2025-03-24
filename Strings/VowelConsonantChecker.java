// Java program to check given character is vowel or consonant. 
public class VowelConsonantChecker {

    public static void main(String[] args) {
        char ch = 'a'; // Change this character to test different cases

        // Using switch-case to check if the character is a vowel or consonant
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
}
