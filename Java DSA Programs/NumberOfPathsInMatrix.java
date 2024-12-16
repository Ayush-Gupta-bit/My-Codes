/* Count all the possible paths from the top left to the bottom right of a M X N matrix with the constraints that from each cell you can either move only to the right or down.
 * 
 * Input: M=2, N=2
 * Output: 2
 * 
 * Input: M=2, N=3
 * Output: 3 
 * 
 */

 public class NumberOfPathsInMatrix {
    // private static int rec(int i, int j, int [][]dp) {
    //     if(i==0 && j==0) {
    //         return dp[i][j]=1;
    //     }
    //     if(i<0 || j<0) 
    //     return 0;
    //     if(dp[i][j]!=-1) 
    //     return dp[i][j];
    //     return dp[i][j]=rec(i-1, j, dp) + rec(i, j-1, dp);
    // }
    public static void main(String args[]) {

        int m=2, n=2;
        int dp[][]=new int[m+1][n+1];

        // for(int i=0; i<m; i++) 
        // for(int j=0; j<n; j++) 
        // dp[i][j]=-1;

        for(int i=0; i<m; i++) 
        dp[i][0]=1;
        
        for(int j=0; j<n; j++) 
        dp[0][j]=1;

        dp[0][0]=1;

        for(int i=1; i<m; i++) 
        for(int j=1; j<n; j++) 
        dp[i][j]=dp[i-1][j]+dp[i][j-1];

        System.out.println(dp[m-1][n-1]);
    }
 }