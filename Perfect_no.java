import java.util.Scanner;
public class Perfect_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Number except Zero:");
        int number = sc.nextInt();
        int sum = 0;
        System.out.print("Factors are:");
        for(int i = 1 ; i < number ; i++)
        {
            if(number % i == 0)
            {
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println("\nThe Sum of Factors are: "+sum);
        if(sum == number)
        {
            System.out.println("It is a Perfect Number");
        }
        else
        {
            System.out.println("It is not a Perfect Number");
        }
        sc.close();
    }
}
