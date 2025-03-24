import java.util.Scanner;
class Prime{
    void number1(int n){
        int count = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
    void number2(int n){
        boolean bool = true;
        for(int i = 2 ; i < n ; i++)
        {
            if(n % i == 0)
            {
               bool = false; 
            }
        }
        if(bool == true)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}
class PrimeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        Prime num = new Prime();
        num.number1(number);
        num.number2(number);
        sc.close();
    }
}
