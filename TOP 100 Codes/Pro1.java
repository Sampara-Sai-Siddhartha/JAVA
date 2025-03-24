// Find a number is positive or negative
import java.util.Scanner;
class Pro1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0)
        {
            System.out.println("The Number "+number+" is Positive");
        }
        else if(number < 0)
        {
            System.out.println("The Number "+number+" is Negative");
        }
        else{
            System.out.println("It is "+number+" (ZERO)");
        }
        sc.close();
    }
}