//Given a number n and a value k, print k multiples of n using recursion
import java.util.*;
public class Question_21 {
    static void printMultiples(int n, int k)
    {
        if(k==1)
        {
            System.out.print(n*k+"  ");
            return;
        }
        printMultiples(n,k-1);
        System.out.print(n*k+"  ");
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the integer whose 'K' multiples are to be displayed : ");
            int n=sc.nextInt();
            System.out.print("Enter the number of multiples 'K' : ");
            int k=sc.nextInt();
            printMultiples(n,k);
        }
    }
}
