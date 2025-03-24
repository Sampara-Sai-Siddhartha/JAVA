import java.util.Scanner;
class FiboSeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Fibonacci Series:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a+" "+b);
        for(int i = 0 ; i < n ; i++)
        {
            sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }
        sc.close();
    }
}
