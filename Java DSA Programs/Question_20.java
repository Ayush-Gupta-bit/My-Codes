// Given two numbers p and q, find the value of p^q using recursion 
import java.util.*;
public class Question_20 {
    static int pow(int p, int q)
    {
        if(q==0)
        return 1;
        int small_pow = pow(p,q/2);
        if(q%2==0)
        return small_pow*small_pow;
        return p*small_pow*small_pow;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner (System.in))
        {
            System.out.print("Enter the base integer (x) : ");
            int n=sc.nextInt();
            System.out.print("Enter the exponent integer (y) : ");
            int m=sc.nextInt();
            System.out.println("The value of x ^ y : "+pow(n,m));
        }
    }
}
