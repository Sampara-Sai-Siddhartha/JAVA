// Power of a Number
import java.util.Scanner;
public class Pro19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double expo = sc.nextDouble();
        double res = Math.pow( base , expo);
        System.out.println(res);
        sc.close();
        double res1 = 1.0;
        while(expo != 0)
        {
            res1 *= base;
            expo--;
        }
        System.out.println(res1);
    }
}
