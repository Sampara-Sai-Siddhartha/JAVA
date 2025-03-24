// Harshad Number
import java.util.Scanner;
public class Pro25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int res = 0;
        while(number != 0)
        {
            int rem = number % 10;
            res += rem;
            number /= 10;
        }
        if(temp % res == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
        sc.close();
    }
}
