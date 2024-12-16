/* Given two strings s1 and s2 and below operations that can be performed on s1. Find the minimum number of edits (operations) required to convert s1 into s2.
 * 1. Insert
 * 2. Remove
 * 3. Replace
 * All the above operations are of equal cost.
 * 
 * Input: s1="cat", s2="cut"
 * Output: 1
 * 
 * Input: s1="SUNDAY" s2="SATURDAY"
 * Output: 3
 */

import java.util.Arrays;

public class INsertRemoveReplaceToEqualizeTwoStrings {
    // private static int rec(int i, int j, String s1, String s2, int[][] dp) {
    //     if(curr[j]!=-1) 
    //     return curr[j];

    //     if(i==0) 
    //     return curr[j]=j;

    //     if(j==0) 
    //     return curr[j]=i;        

    //     if(s1.charAt(i-1)==s2.charAt(j-1)) 
    //     return curr[j]=rec(i-1, j-1, s1, s2, dp);

    //     int replace=1+rec(i-1, j-1, s1, s2, dp);
    //     int insertion=1+rec(i, j-1, s1, s2, dp);
    //     int deletion=1+rec(i-1, j, s1, s2, dp);

    //     return curr[j]=Math.min(replace, Math.min(insertion, deletion));
    // }
    public static void main(String args[]) {
        String s1="SUNDAY", s2="SATURDAY";
        int n=s2.length(), m=s1.length();
        // int dp[][]=new int[m+1][n+1];
        int prev[]=new int[n+1];
        int []curr=new int[n+1];
        // for(int i=0; i<=m; i++) 
        // for(int j=0; j<=n; j++) 
        // curr[j]=-1;
        for(int i=0; i<=m; i++) 
        prev[i]=i;
        // for(int j=0; j<=n; j++) 
        // dp[0][j]=j;
        for(int i=1; i<=m; i++) {
            curr[0]=i;
            for(int j=1; j<=n; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    curr[j]=prev[j-1];
                    continue;
                }
                int replace=1+prev[j-1];
                int insertion=1+curr[j-1];
                int deletion=1+prev[j];
                curr[j]=Math.min(replace, Math.min(insertion, deletion));
            }
            prev=Arrays.copyOf(curr, n+1);
        }

        System.out.println(prev[n]);
    }
}