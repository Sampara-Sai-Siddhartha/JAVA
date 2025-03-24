// Hexadecimal to Decimal Conversion (important)
import java.util.Scanner;
public class Pro33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexadecimal = sc.next();
        hexadecimal = hexadecimal.toUpperCase();
        String digits = "0123456789ABCDEF";
        int l = hexadecimal.length() - 1;
        int sum = 0;
        for(int i = 0 ; i <= l ; i++)
        {
            char ch = hexadecimal.charAt(i);
            int a = digits.indexOf(ch);
            sum += a * (int) Math.pow(16, l - i);
        }
        System.out.println("Decimal: "+sum);
        sc.close();
    }
}
