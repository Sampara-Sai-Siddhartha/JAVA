// Perfect Square
import java.util.Scanner;
public class Pro23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0)
        {
            int x = (int) Math.sqrt(number);
            if((x*x) == number)
            {
                System.out.println("Perfect Square");
            }
            else{
                System.out.println("Not Perfect Square");
            }
        }
        if(Math.floor(Math.sqrt(number)) == Math.ceil(Math.sqrt(number)))
        {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        sc.close();
    }
}
