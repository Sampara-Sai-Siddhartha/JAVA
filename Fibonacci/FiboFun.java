import java.util.Scanner;
class Fibo{
    void Series(int n)
    {
        int a = 0;
        int b = 1;
        // int sum = 0;
        System.out.print(a+" "+b);
        for(int sum = 0 ; n != 0 ; n--)
        {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" "+sum);
        }
    }
}
class FiboFun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Fibonacci Series:");
        int n = sc.nextInt();
        Fibo seri = new Fibo();
        seri.Series(n);
        sc.close();
    }
}
