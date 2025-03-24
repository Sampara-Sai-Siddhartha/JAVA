// Find the number is Even or odd
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0)
        {
            System.out.println(number+" is EVEN");
        }
        else
        {
            System.out.println(number+" is Odd");
        }
        sc.close();
    }
}
