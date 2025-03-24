// Octal to Binary Conversion
// for this Conversion first we need to Convert Octal to Decimal and then Convert Decimal to Binary
import java.util.Scanner;
public class Pro38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Octal: ");
        int octal = sc.nextInt();
        int decimal = 0;
        int n = 0;
        sc.close();
        while(octal > 0)
        {
            int temp = octal % 10;
            decimal += temp * Math.pow(8,n);
            octal /= 10;
            n++;
        }
        System.out.println("Decimal: "+decimal);
        int binary[] = new int[20];
        int i = 0;
        while (decimal > 0) {
            int r = decimal % 2;
            binary[i++] = r;
            decimal /= 2;
        }
        System.out.print("Binary: ");
        for(int j = i - 1 ; j >= 0 ; j--)
        {
            System.out.print(binary[j]);
        }
    }
}
