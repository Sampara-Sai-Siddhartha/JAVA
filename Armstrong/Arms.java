import java.util.Scanner;
class Arms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        int temp = number;
        int result = 0;
        while(temp != 0)
        {
            int rem = temp % 10;
            result += rem*rem*rem;
            temp = temp / 10;
        }
        if(number == result)
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