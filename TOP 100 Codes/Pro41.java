// Maximum number of handshakes in java
// num * (num-1) / 2;
import java.util.Scanner;
public class Pro41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hs = n * (n-1) / 2;
        System.out.println("For "+n+" people there will be "+hs+ " handshakes");
        sc.close();
    }
}
