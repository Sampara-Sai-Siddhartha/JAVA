// Finding number of integers which has exactly X divisors
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0 , x = 2;
        for(int i = 1 ; i <= num ; i++)
        {
            int factors = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                {
                    factors++;
                }
            }
            if(factors == x)
            {
                count++;
            }
        }
        System.out.println("The No of Divisors are: "+count);
        sc.close();
    }
}
