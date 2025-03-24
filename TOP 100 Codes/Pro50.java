// Counting number of days in a given month and year

import java.util.Scanner;

public class Pro50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if((month == 2) && (year % 400 == 0) || (year % 100 != 0) && (year % 4 != 0))
        {
            System.out.println("Total Number of Days: 29");
        }
        else if(month == 2)
        {
            System.out.println("Total Number of Days: 28");
        }
        else if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
        {
            System.out.println("Total Number of Days: 31");
        }
        else
        {
            System.out.println("Total No of Days: 30");
        }
        sc.close();
    }
}
