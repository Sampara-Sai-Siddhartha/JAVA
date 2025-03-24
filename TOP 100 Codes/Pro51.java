// Occurrence of a digit in a given number using Java
import java.util.Scanner;
public class Pro51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        int count = 0;
        while (number != 0) {
            int rem = number % 10;
            if(rem == digit)
            {
                count++;
            }
            number /= 10;
        }
        System.out.println("The No of "+digit+"`s in the number are: "+count);
        sc.close();
    }
}
