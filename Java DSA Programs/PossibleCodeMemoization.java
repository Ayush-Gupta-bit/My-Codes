/* A message containing letters from A-Z can be encoded into numbers using the following mapping :
A-1
B-2
C-3
...
Z-26
To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into :
AAJF with the grouping 1 1 10 6
KJF with the grouping 11 10 6
Note that the grouping 1 11 06 is invalid because 06 cannot be mapped into F since 6 is different from 06.
Given a string s containing only digits, return the number of ways to decode it.

Input: s="12"
Output: 2

Input: s="226"
Output: 3

 */

public class PossibleCodeMemoization {
    public static int numberOfWays(String number, int idx, int dp[]) {
        if(idx<=0) 
        return 1;
        if(dp[idx]!=-1) 
        return dp[idx];
        int notCombine=0;
        if(number.charAt(idx)!='0') 
        notCombine=numberOfWays(number, idx-1, dp);
        int combine=0;
        if(number.charAt(idx-1)=='1'||(number.charAt(idx-1)=='2' && number.charAt(idx)<='6')) {
            combine=numberOfWays(number, idx-2, dp);
        }
        return dp[idx]=combine+notCombine;
    }
    public static void main(String args[]) {
        String number="11126";
        int dp[]=new int [number.length()];
        for(int i=0; i<number.length(); i++) 
        dp[i]=-1;
        System.out.println(numberOfWays(number, number.length()-1, dp));
    }
}
