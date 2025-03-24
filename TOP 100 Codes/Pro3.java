// Find the sum of first N natural numbers
// import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int number = 10;
        int sum = 0;
        for(int i = 1 ; i <= number ; i++)
        {
            sum += i;
        }
        System.out.println("Sum of First N Number: "+sum);
        // sc.close();
    }
}
