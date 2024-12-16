//Remove all the occurences of 'a' from the string 'str' using recursion
import java.util.*;
public class Question_29 {
    static String removeA(String str, int idx)
    {
        if(idx==str.length())
        return "";
        String smallAns=removeA(str, idx+1);
        char currChar=str.charAt(idx);
        if(currChar!='a')
        return currChar+smallAns;
        else
        return smallAns;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a String : ");
            String s=sc.nextLine();
            System.out.println("New String without 'a' : "+removeA(s, 0));
        }
    }
}
