// Prime number btw 1 to 100
// it can give prime numbers btw any two numbers that are given
import java.util.Scanner;
public class Pro47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("From: ");
        int num1 = sc.nextInt();
        System.out.print("To: ");
        int num2 = sc.nextInt();
        for(int i = num1 ; i <= num2 ; i++)
        {
            if(prime_or_not(i))
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    static boolean prime_or_not(int n)
    {
        if(n < 2)
        {
            return false;
        }
        for(int i = 2 ; i < n/2 ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
}
