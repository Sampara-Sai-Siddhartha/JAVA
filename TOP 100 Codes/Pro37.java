// Binary to Octal Conversion
// for this Conversion we need to first Convert Binary to Decimal and then Convert Decimal to Octal.
import java.util.Scanner;
public class Pro37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(binary > 0)
        {
            int temp = binary % 10;
            decimal += temp * Math.pow(2,n);
            binary /= 10;
            n++;
        }
        System.out.println("Decimal: "+decimal);
        int octal[] = new int[20];
        int i = 0;
        while(decimal > 0)
        {
            int r = decimal % 8;
            octal[i++] = r;
            decimal /= 8;
        }
        System.out.print("Octal: ");
        for(int j = i - 1 ; j >= 0 ; j--)
        {
            System.out.print(octal[j]);
        }
        sc.close();
    }
}
