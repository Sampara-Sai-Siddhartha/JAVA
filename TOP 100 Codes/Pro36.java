// Decimal to Hexadecimal conversion
import java.util.Scanner;
public class Pro36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        char hexadecimal[] = new char[20];
        int i = 0;
        while(decimal != 0)
        {
            int rem = decimal % 16;
            if(rem < 10)
            {
                hexadecimal[i++] = (char) (rem + 48);
            }
            else{
                hexadecimal[i++] = (char) (rem + 55);
            }
            decimal /= 16;
        }
        System.out.print("Hexadecimal: ");
        for(int j = i - 1 ; j >= 0 ; j--)
        {
            System.out.print(hexadecimal[j]);
        }
        sc.close();
    }
}
