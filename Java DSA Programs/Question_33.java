/*Given a string, write a method to print all its subsequences. */
import java.util.*;
public class Question_33 {
    static void printAllSubsequences(String s, String currAns)
    {
        if(s.length()==0)
        {
            System.out.print("  "+currAns);
            return;
        }
        char currChar=s.charAt(0);
        String remString= s.substring(1);
        printAllSubsequences(remString, currAns+currChar);
        printAllSubsequences(remString, currAns);
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter a string : ");
            String s=sc.nextLine();
            System.out.print("All the subsequences of given string are :");
            printAllSubsequences(s,"");
        }
    }
}
