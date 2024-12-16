//Given a number n, find the sum of n natural numbers with alternate signs using recursion
import java.util.*;
public class Question_22 {
    static int seriesSum(int n)
    {
        if(n==0)
        return 0;
        if(n%2==0)
        return seriesSum(n-1)-n;
        return seriesSum(n-1)+n;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the number of Integers in the series : ");
            int n = sc.nextInt();
            System.out.println("The sum of terms of the required series : "+seriesSum(n));
        }
    }
}
