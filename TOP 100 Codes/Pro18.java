// Factorial of a Number
import java.util.Scanner;
public class Pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1;
        int n = sc.nextInt();
        System.out.println("Recursion: "+Factorial(n));
        for(int i = 2 ; i <= n ; i++)
        {
            res *= i;
        }
        System.out.println("Loop: "+res);
        sc.close();
    }
    static int Factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
