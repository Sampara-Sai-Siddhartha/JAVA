import java.util.Scanner;
class FactorialRec {
    static long factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        long factorial = factorial(number);
        System.out.println("Factorial of "+number+" is:"+factorial);
        sc.close();
    }
}
