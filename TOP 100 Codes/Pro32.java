// Octal to Decimal Conversion
import java.util.Scanner;
public class Pro32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(octal > 0)
        {
            int temp = octal % 10;
            decimal += temp * Math.pow(8,n);
            octal /= 10;
            n++;
        }
        System.out.println("Decimal :"+decimal);
        sc.close();
    }
}
