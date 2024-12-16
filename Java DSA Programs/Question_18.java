// Sum of digits using Recursion
import java.util.*;
public class Question_18 {
    static int sumOfDigits(int n)
    {
        if(n>=0 && n<=9)
        return n;
        return sumOfDigits(n/10) + n%10;
    }
    public static void main(String args [])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an Integer : ");
            int n=sc.nextInt();
            System.out.println("Sum of Digits of entered number is : "+sumOfDigits(n));
        }
    }
}