// Fibonacci Series
import java.util.Scanner;
public class Pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum = 0;
        int range = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i = 2 ; i < range ; i++)
        {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
        sc.close();
    }
}