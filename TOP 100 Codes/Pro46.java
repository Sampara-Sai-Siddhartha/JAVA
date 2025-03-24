// Area of Circle

import java.util.Scanner;

public class Pro46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
