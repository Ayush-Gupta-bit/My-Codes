//Given two integers, x and y, find their GCD using recursion
import java.util.*;
public class Question_23 {
    static int gcd(int x, int y)
    {
        if(y==0)
        return x;
        return gcd(y, x%y);
    }    
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner (System.in))
        {
            System.out.print("Enter the first number : ");
            int x=sc.nextInt();
            System.out.print("Enter the second number :");
            int y=sc.nextInt();
            System.out.println("The Greatest Common Divisor of the two entered numbers : "+gcd(x,y));
        }
    }
}
