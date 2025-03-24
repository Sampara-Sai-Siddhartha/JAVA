// Find the sum of digits 
import java.util.Scanner;
public class Pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0)
        {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
