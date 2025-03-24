// Friendly Pair
import java.util.Scanner;
public class Pro27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumn = 0 , summ = 0;
        for(int i = 1 ; i <= n/2 ; i++)
        {
            if(n % i == 0)
            {
                sumn += i;
            }
        }
        for(int i = 1 ; i <= m/2 ; i++)
        {
            if(m % i == 0)
            {
                summ += i;
            }
        }
        if((sumn / n) == (summ / m))
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
        int sum1 = getDivisorSum(n);
        int sum2 = getDivisorSum(m);
        if(sum1 / n == sum2 / m)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
    static int getDivisorSum(int n)
    {
        int sum = 0;
        for(int i = 1 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

}
