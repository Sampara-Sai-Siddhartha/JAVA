// Find the sum of N natural numbers
import java.util.Scanner;
public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The Sum of N number: "+number*(number+1)/2);
        sc.close();
    }
}
