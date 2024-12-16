// Reverse a string using recursion 
import java.util.*;
public class Question_30 {
    static String reverse (String s, int idx)
    {
        if(idx==s.length())
        return "";
        String smallAns = reverse(s, idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a string : ");
            String s=sc.nextLine();
            System.out.println("Reversed String : "+reverse(s, 0));
        }
    }
}
