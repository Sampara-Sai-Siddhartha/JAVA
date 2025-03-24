// Strong Number
import java.util.Scanner;
public class Pro21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while(temp != 0)
        {
            int digit = temp % 10;
            sum += fac(digit);
            temp /= 10;
        }
        if(sum == number)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
        sc.close();
    }
    static int fac(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n * fac(n - 1);
    }
}
