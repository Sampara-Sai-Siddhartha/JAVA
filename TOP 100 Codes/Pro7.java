// Find the greatest number among three numbers
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = sc.nextInt();
        System.out.print("N2: ");
        int n2 = sc.nextInt();
        System.out.print("N3: ");
        int n3 = sc.nextInt();
        if(n1 > n2)
        {
            if(n1 > n3)
            {
                System.out.println("N1 is greater than N2 and N3");
                System.out.println(n1+" > "+n2+" & "+n3);
            }
        }
        else if(n2 > n3)
        {
            System.out.println("N2 is greater than N1 and N3");
            System.out.println(n2+" > "+n1+" & "+n3);
        }
        else
        {
            System.out.println("N3 is greater than N1 and N2");
            System.out.println(n3+" > "+n2+" & "+n1);
        }
        sc.close();
    }
}
