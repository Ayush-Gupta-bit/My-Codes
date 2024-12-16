// Return count of digits using recursion 
import java.util.*;
public class Question_19 {
    static int numberOfDigits(int n)
    {
        if(n<10)
        return 1;
        return numberOfDigits(n/10)+1;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter an Integer : ");
            int n=sc.nextInt();
            System.out.println("The number of digits in the entered integer : "+numberOfDigits(n));
        }
    }
}
