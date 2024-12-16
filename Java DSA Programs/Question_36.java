/* Given a string containing digits from 2-9 inclusive, return all possible combinations that the number could represent. */
import java.util.*;
public class Question_36 {
    static void combination(String dig, String kp[], String res)
    {
        if(dig.length()==0)
        {
            System.out.print(" "+res);
            return;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoices=kp[currNum];
        for(int j=0; j<currChoices.length(); j++)
        combination(dig.substring(1), kp, res+currChoices.charAt(j));
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the digits : ");
            String dig=sc.nextLine();
            String kp[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            System.out.print("All the possible combinations : ");
            combination(dig, kp, "");
        }
    }
}
