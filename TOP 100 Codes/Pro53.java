// Finding Roots of a quadratic equation in Java (important)
import java.util.Scanner;
public class Pro53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == 0)
        {
            System.out.println("Invalid");
        }
        int d = b * b - 4 * a * c;
        int d1 = Math.abs(d);
        double sqrt_val = Math.sqrt(d1);
        if(d > 0)
        {
            System.out.println("Roots are Real and Different");
            System.out.println((double)(-b+sqrt_val)/(2*a)+"\n"+(double)(-b-sqrt_val)/(2*a));
        }
        else if(d == 0)
        {
            System.out.println("Roots are Real and Same");
            System.out.println((double)(-b)/(2*a)+"\n"+(double)(-b)/(2*a));
        }
        else
        {
            System.out.println("Roots are Complex");
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
        }
        sc.close();
    }
}
