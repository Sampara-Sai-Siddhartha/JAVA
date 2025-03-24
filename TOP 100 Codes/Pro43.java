// Replace 0's to 1's
import java.util.Scanner;
public class Pro43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        String str1 = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '0')
            {
                str1 = str1 + "1";
            }
            else{
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.println(str1);
        num = Integer.parseInt(str1);
        System.out.println(num);
        sc.close();
    }
}
