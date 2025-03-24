// Permutations in which n people can occupy r seats in a classroom in java
//  n P r  =    n! / (n-r)!
import java.util.Scanner;
public class Pro40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Students: ");
        int n = sc.nextInt();
        System.out.print("No of Seats: ");
        int r = sc.nextInt();
        int per = fac(n) / fac(n-r);
        System.out.println("we can arrange in "+per+" ways");
        sc.close();
    }
    static int fac(int n)
    {
        int res = 1;
        for(int i = 2 ; i <= n ; i++)
        {
            res *= i;
        }
        return res;
    }
}
