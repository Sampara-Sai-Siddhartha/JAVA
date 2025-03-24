// Find the sum of numbers in a given range
import java.util.Scanner;
public class Pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The Sum of number in a given range: "+number*(number+1)/2);
        sc.close();
    }
}
