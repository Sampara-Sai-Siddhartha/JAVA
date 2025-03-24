// a number can be expressed as sum of two numbers
import java.util.Scanner;
public class Pro44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        for(int i = 2 ; i <= num/2 ; i++)
        {
            if(prime_or_not(i) == 1)
            {
                if(prime_or_not(num-i) == 1)
                {
                    System.out.println(num+" = "+i+" + "+(num-i));
                    x = 1;
                }
            }
        }
        if(x == 0)
        {
            System.out.println(num+" is not supported to express sum of two primes");
        }
        sc.close();
    }
    static int prime_or_not(int n)
    {
        int c = 1;
        for(int i = 2 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                c = 0;
                break;
            }
        }
        return c;
    }
}
