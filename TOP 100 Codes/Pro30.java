// Greatest Common Divisor (GCD)
// It is also same as the HCF. So now i do it in the Euclidean Algorithm
import java.util.Scanner;
public class Pro30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1 != num2)
        {
            if(num1 > num2)
            {
                num1 -= num2;
            }
            else
            {
                num2 -= num1;
            }
        }
        System.out.println("GCD: "+num1);
        sc.close();
    }
}
