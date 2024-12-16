/*Given an integer array of coins[] of size N representing different types of currency and an integer sum. The task is to find the number of ways to make sum by using different combinations from coins[]. Assume that you have an infinite supply of each type of coin.
 * 
 * Input: sum=4, coins[]={1,2,3}
 * Output: 4
 * 
 * Input: sum=10, coins[]={2,5,3,6}
 * Output: 5
 */

import java.util.*;
public class CoinChangeTabulation {
    // private static int rec(List<Integer> coins, int sum, int idx, int[][] dp) {
    //     if(dp[idx][sum]!=-1) 
    //     return dp[idx][sum];
    //     if(idx==0) {
    //         if(sum%coins.get(idx)==0) 
    //         return 1;
    //         else
    //         return 0;
    //     }
    //     int pick=0;
    //     if(sum>=coins.get(idx))
    //     pick=rec(coins, sum-coins.get(idx), idx, dp);
    //     int notPick=rec(coins, sum, idx-1, dp);
    //     return dp[idx][sum]=pick+notPick;
    // }
    public static void main(String args[]) {
        List<Integer> coins=List.of(2,5,3,6);
        int sum=10;
        // int [][]dp=new int[coins.size()+1][sum+1];
        // for(int i=0; i<coins.size()+1; i++) {
        //     for(int j=0; j<=sum; j++) 
        //     dp[i][j]=-1;
        // }
        int curr[]=new int[sum+1];
        int prev[]=new int[sum+1];
        for(int i=0; i<sum+1; i++) {
            if(i%coins.get(0)==0) 
            prev[i]=1;
            else 
            prev[i]=0;
        }
        for(int i=1; i<coins.size(); i++) {
            for(int j=0; j<=sum; j++) {
                int pick=0;
                if(j>=coins.get(i)) 
                pick=curr[j-coins.get(i)];
                int notPick=prev[j];
                curr[j]=pick+notPick;
            }
            prev=curr;
        } 
        System.out.println(prev[sum]);
    }
}
