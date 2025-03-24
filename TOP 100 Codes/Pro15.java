// Armstrong Numbers within a Range
import java.util.Scanner;
public class Pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int num = low ; num <= high ; num++)
        {
            int sum = 0;
            int len = 0;
            int digit = 0;
            int temp1 = num;
            int temp2 = num;
            while(temp1 != 0)
            {
                len++;
                temp1 = temp1 / 10;
            }
            while(temp2 != 0)
            {
                digit = temp2 % 10;
                sum = sum + (int) Math.pow(digit, len);
                temp2 /= 10;
            }
            if(sum == num)
            {
                System.out.println(num + "");
            }
            sc.close();
        }

    }
}
