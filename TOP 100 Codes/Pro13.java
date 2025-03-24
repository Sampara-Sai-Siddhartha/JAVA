//Find the given number is Palindrome or not
import java.util.Scanner;
public class Pro13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int rev = 0;
        while(number != 0)
        {
            rev = number % 10 + rev * 10;
            number = number / 10;
        }
        System.out.println(rev);
        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
