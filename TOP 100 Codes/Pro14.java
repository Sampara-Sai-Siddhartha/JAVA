// Armstrong Number
import java.util.Scanner;
public class Pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0 , length = 0;
        int temp1 = number , temp2 = number;
        while(temp1 != 0)
        {
            length++;
            temp1 /= 10;
        }
        while(number != 0)
        {
            sum += (int)Math.pow(number % 10 , length);
            number /= 10;
        }
        if(temp2 == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
