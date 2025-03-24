//Find the number is prime number or not
import java.util.Scanner;
public class Pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if(number == 1)
        {
            System.out.println("Prime");
            System.exit(1);
        }
        for(int i = 1 ; i <= number/2 ; i++)
        {
            if(number % i == 0)
            {
                count++;
            }
        }
        if(count == 1)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        sc.close();
    }    
}
