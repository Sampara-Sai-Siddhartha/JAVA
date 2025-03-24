import java.util.Scanner;
class Fibo{
    int series(int n,int a,int b)
    {
        if(n != 0){
            int sum = 0;
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
            n--;
        }
        else{
            return 0;
        }
        return series(n,a,b);
    }
}
public class FiboRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Fibonacci Series:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("N1:"+a+" "+"N2:"+b);
        Fibo f = new Fibo();
        f.series(n,a,b);
        sc.close();
    }
}
