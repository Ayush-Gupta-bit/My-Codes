/* Given two strings s1 and s2 and below operations that can be performed on s1. Find the minimum number of edits (operations) required to convert s1 into s2.
 * 1. Insert
 * 2. Remove
 * Both the above operations are of equal cost.
 * 
 * Input: s1="cat", s2="cut"
 * Output: 2
 * 
 * Input: s1="SUNDAY" s2="SATURDAY"
 * Output: 4
 */

public class InsertRemoveToEqualizeTwoStrings {
    // private static int rec(String s1, String s2, int i, int j, int [][]dp) {
    //     if(i==0 || j==0) 
    //     return 0;
    //     if(dp[i][j]!=-1) 
    //     return dp[i][j];
    //     if(s1.charAt(i-1)==s2.charAt(j-1)) 
    //     return dp[i][j]= 1+rec(s1, s2, i-1, j-1, dp);
    //     return dp[i][j]=Math.max(rec(s1, s2, i-1, j, dp), rec(s1, s2, i, j-1, dp));
    // }
    public static void main(String args[]) {
        String s1="SUNDAY", s2="SATURDAY";
        int m=s1.length(), n=s2.length();
        // int [][]dp=new int[m+1][n+1];
        int []curr=new int[n+1];
        int []prev=new int[n+1];
        for(int i=0; i<=n; i++) 
        prev[0]=0;
        // for(int j=0; j<=n; j++) 
        // dp[0][j]=0;
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) 
                curr[j]=1+prev[j-1];
                else 
                curr[j]=Math.max(prev[j], curr[j-1]);
                prev=curr;
            }
        }
        System.out.println(s1.length()-prev[n]+s2.length()-prev[n]);

    }
}

