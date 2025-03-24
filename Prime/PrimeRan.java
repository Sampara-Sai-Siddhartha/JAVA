import java.util.Scanner;
public class PrimeRan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime Numbers upto Specific Range");        
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        System.out.println("The Prime Numbers upto "+number+" Number are:");
        for(int i = 2 ; i <= number ; i++){
            boolean flag = true;
            for(int j = 2 ; j < i ; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
