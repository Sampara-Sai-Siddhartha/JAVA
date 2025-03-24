// Decimal to Octal conversion
import java.util.Scanner;
public class Pro35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int octal[] = new int[10];
        int i = 0;
        while(decimal > 0)
        {
            int r = decimal % 8;
            octal[i++] = r;
            decimal /= 8;
        }
        System.out.print("Octal: ");
        for(int j = i -1 ; j >= 0 ; j--)
        {
            System.out.print(octal[j]);
        }
        sc.close();
    }
}
