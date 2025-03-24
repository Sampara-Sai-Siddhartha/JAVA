// Find the no of digits in a number
import java.util.Scanner;
public class Pro48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;
        while(num != 0)
        {
            digits++;
            num /= 10;
        }
        System.out.println("Count: "+digits);
        sc.close();
    }
}
