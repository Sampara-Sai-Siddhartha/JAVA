import java.util.Scanner;
class ArmsFun{
    static int strong(int temp)
    {
        int result;
        for(result = 0 ; temp!=0 ; temp /= 10)
        {
            int rem = temp % 10;
            result += rem*rem*rem;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int temp = number;
        int armstrong = strong(temp);
        if(number == armstrong)
        {
            System.out.println("It is an Armstrong Number");
        }
        else
        {
            System.out.println("It is Not an Armstrong Number");
        }
        sc.close();
    }
}