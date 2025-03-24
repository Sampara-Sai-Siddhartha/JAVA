import java.util.Scanner;
public class RecSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        int result = sum1(number);
        System.out.println("Sum of 1 to "+number+" are:"+result);
        sc.close();
    }
    static int sum1(int n)
    {
        if(n != 0)
        {
            return n + sum1(n-1);
        }
        return 0;
    }
}
