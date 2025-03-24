import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        boolean bool = true;
        for(int i = 1 ; i <= number ; i++)
        {
            if(number % i == 0)
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
        for(int i = 2 ; i < number ; i++)
        {
            if(number % i == 0)
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
        sc.close();
    }
}