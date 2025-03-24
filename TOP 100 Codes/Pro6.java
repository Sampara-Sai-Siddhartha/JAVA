// Find the greatest of Two numbers
import java.util.Scanner;
public class Pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = sc.nextInt();
        System.out.print("N2: ");
        int n2 = sc.nextInt();
        if(n1 > n2)
        {
            System.out.println("N1 is greater than N2");
            System.out.println(n1+" > "+n2);
        }
        else
        {
            System.out.println("N2 is greater than N1");
            System.out.println(n1+" < "+n2);
        }
        sc.close();
    }
}
