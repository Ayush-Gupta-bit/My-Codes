/* Given a M X N grid filled with non-negative numbers, find a path from top-left to bottom-right, which minimizes the sum of all numbers along its path. You can only move either down or right at any point in time.
 * 
 * Input: grid=[[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * 
 * Input: grid=[[1,2,3],[4,5,6]]
 * Output: 12
 * 
 */

 import java.util.*;
public class MinimumPathSum {
    // private static int rec(int i, int j, List<List<Integer>> grid, int[][] dp) {
    //     if(i==0 && j==0) 
    //     return dp[0][0]=grid.get(0).get(0);

    //     if(i<0 || j<0) 
    //     return Integer.MAX_VALUE;

    //     if(dp[i][j]!=-1) 
    //     return dp[i][j];

    //     return dp[i][j]=grid.get(i).get(j)+Math.min(rec(i-1, j, grid, dp), rec(i, j-1, grid, dp));
    // }
    public static void main(String args[]) {
        List<List<Integer>> grid=new ArrayList<>();

        grid.add(List.of(1,3,1));
        grid.add(List.of(1,5,1));
        grid.add(List.of(4,2,1));

        int m=grid.size();
        int n=grid.get(0).size();
        int dp[][]=new int[m][n];

        // for(int i=0; i<m; i++) 
        // for(int j=0; j<n; j++) 
        // dp[i][j]=-1;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 && j==0) 
                {
                    dp[i][j]=grid.get(0).get(0);
                    continue;
                }
                int D=Integer.MAX_VALUE;
                if(i>0) 
                D=dp[i-1][j];
                int R=Integer.MAX_VALUE;
                if(j>0) 
                R=dp[i][j-1];
                dp[i][j]=grid.get(i).get(j)+Math.min(D,R);
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
