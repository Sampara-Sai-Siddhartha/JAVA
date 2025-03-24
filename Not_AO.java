import java.util.Scanner;
public class Not_AO {
    static int plus(int num1, int num2)
    {
        if(num2 == 0)
        {
            return num1;
        }
        while(num2 != 0){
            int temp = num1 & num2;
            num1 = num1 ^ num2;
            num2 = temp << 1;
        }   
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int n2 = sc.nextInt();
        int sum = plus(n1, n2);
        while(n2!=0)
        {
            int carry = n1 & n2;
            n1 = n1 ^ n2;
            n2 = carry << 1;
        }
        System.out.println("Sum = "+n1);
        System.out.println("Function Sum: "+sum);
        sc.close();
    }
}
