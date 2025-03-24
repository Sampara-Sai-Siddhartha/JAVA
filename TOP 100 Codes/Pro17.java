// Fibonacci Series in recursion
import java.util.Scanner;
public class Pro17 {
    static int a = 0 , b = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(a+" "+b+" ");
        Fibonacci(num - 2);
        sc.close();
    }
    static void Fibonacci(int n)
    {
        int sum = 0;
        if(n > 0)
        {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
            Fibonacci(n-1);
        }
    }
}
