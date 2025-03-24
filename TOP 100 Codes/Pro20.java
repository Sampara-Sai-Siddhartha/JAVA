// Fining the prime factors for a number
import java.util.Scanner;
public class Pro20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Prime Factors are: ");
        prime_factors(number);
        sc.close();
    }
    static void prime_factors(int n)
    {
        for(int i = 2 ; i <= n ; i++)
        {
            if(isPrime(i) == 1)
            {
                int x = n;
                while(x % i == 0){
                    System.out.print(i+" ");
                    x /= i;
                }
            }
        }
    }
    static int isPrime(int n)
    {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
}
