// Reverse a given number
import java.util.Scanner;
public class Pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        while(number != 0)
        {
            rev = number % 10 + rev * 10;
            number = number / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
