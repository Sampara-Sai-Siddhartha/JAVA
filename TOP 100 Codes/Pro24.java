// Automorphic Number
import java.util.Scanner;
public class Pro24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int square = number * number;
        if((square % 10) == (number % 10))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
        sc.close();
    }
}
