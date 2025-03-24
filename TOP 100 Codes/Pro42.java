// Addition of Two Fractions (important)
import java.util.Scanner;
public class Pro42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Den1: ");
        int den1 = sc.nextInt();
        System.out.print("Num2: ");
        int num2 = sc.nextInt();
        System.out.print("Den2: ");
        int den2 = sc.nextInt();
        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = (den1 * den2);
        int gcd = gcd(numerator , denominator);
        numerator = numerator / gcd;
        denominator = denominator /gcd;
        System.out.println(num1+"   "+num2+"   "+numerator);
        System.out.println("- + - = -");
        System.out.print(den1+"   "+den2+"   "+denominator);
        sc.close();
    }
    static int gcd(int n , int d)
    {
        if(d == 0)
        {
            return n;
        }
        return gcd(d , n%d);
    }
}
