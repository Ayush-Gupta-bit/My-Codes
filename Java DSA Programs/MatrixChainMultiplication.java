/*Given the dimension of a sequence of matrices in an array arr[], where the dimension of the matrix is (arr[i-1]*arr[i]), the task is to find the most efficient way to multiply these matrices together such that the total number of element multiplications is minimum.
 * 
 * Input: n=5
 *        arr[]={40, 20, 30, 10, 30}
 * Output: 26000
 * 
 * Input: n=5
 *        arr[]={1,2,3,4,5}
 * Output: 30
 * 
*/

import java.util.*;
public class MatrixChainMultiplication {
    // private static int rec(int i, int j, List<Integer> arr, int[][] dp) {
    //     if(dp[i][j]!=-1) 
    //     return dp[i][j];
    //     if(i==j) 
    //     return 0;
    //     int minimum=8888888;
    //     for(int k=i; k<j; k++) {
    //         int cost=rec(i, k, arr, dp) + rec(k+1, j, arr, dp) + (arr.get(i-1)*arr.get(k)*arr.get(j));
    //         if(cost<minimum) 
    //         minimum = cost;
    //     }
    //     return dp[i][j]=minimum;
    // }
    public static void main(String args[]) {
        List<Integer> arr=List.of(40, 20, 30, 10, 30);
        int n=arr.size();
        int [][]dp=new int[n][n];
        // for(int i=0; i<n; i++) 
        // for(int j=0; j<n; j++) 
        // dp[i][j]=-1;
        for(int i=0; i<n; i++) 
        dp[i][i]=0;

        for(int i=n-1; i>=1; i--) {
            for(int j=i+1; j<n; j++) {
                int minimum=999999;
                for(int k=i; k<j; k++) {
                    int cost=dp[i][k] + dp[k+1][j] + arr.get(i-1)*arr.get(k)*arr.get(j);
                    if(cost<minimum) 
                    minimum=cost;
                }
                dp[i][j]=minimum;
            }
        }
        System.out.println(dp[1][n-1]);
    }
}
