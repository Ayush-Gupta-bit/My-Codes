//Check whether a string is a palindrome or not
import java.util.*;
public class Question_31 {
    static boolean isPalindrome(String s, int l, int r)
    {
        if(l>=r)
        return true;
        return (Character.toUpperCase(s.charAt(l))==Character.toUpperCase(s.charAt(r)) && isPalindrome(s, l+1, r-1));
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner (System.in))
        {
            System.out.print("Enter a string : ");
            String s=sc.nextLine();
            if(isPalindrome(s, 0, s.length()-1))
            System.out.println("Yes, the entered string is a Palindrome.");
            else
            System.out.println("No, the entered string is not a palindrome.");
        }
    }
}
