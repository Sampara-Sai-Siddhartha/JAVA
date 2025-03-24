// Find the year is leap year or not
import java.util.Scanner;
public class Pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 400 != 0 && number % 4 == 0 && number % 100 != 0)
        {
            System.out.println(number+" is a Leap Year");
        }
        else
        {
            System.out.println(number+" is not a Leap Year");
        }
        sc.close();
    }
}