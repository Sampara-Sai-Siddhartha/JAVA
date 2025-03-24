// Find the Prime numbers within in a range
import java.util.Scanner;
public class Pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if(number == 1)
        {
            System.out.println("Prime no: "+number);
        }
        for(int i = 2 ; i <= number ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println("Prime no: "+i);
            }
            count = 0;
        }
        sc.close();
    }
}
