// Perfect Number
import java.util.Scanner;
public class Pro22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i < number ; i++)
        {
            if(number % i == 0)
            {
                sum += i;
            }
        }
        if(sum == number)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
        sc.close();
    }
}
