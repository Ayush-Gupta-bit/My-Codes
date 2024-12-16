/*We are given N items where each item has some weight and profit associated with it. We are also given a bag with capacity W i.e. the bag can hold atmost W weight in it. The target is to put the items into the bag such that the sum of profits associated with them is the maximum possible. 
 * 
 * Input: N=3, W=4, profit[]={1,2,3}, weight[]={4,5,1}
 * Output: 3
 * 
 */

import java.util.*;
public class Knapsack01Tabulation {
    // private static int rec(int idx, int w, List<Integer> profit, List<Integer> weight, int [][]dp) {
    //     if(dp[idx][w]!=-1) 
    //     return dp[idx][w];
    //     if(idx==0) {
    //         if(weight.get(0)<=w) 
    //         return profit.get(0);
    //         else 
    //         return 0;
    //     }
    //     int pick=0;
    //     if(w>=weight.get(idx))
    //     pick=profit.get(idx)+rec(idx-1, w-weight.get(idx), profit, weight, dp);
    //     int notPick=rec(idx-1, w, profit, weight, dp);
    //     return dp[idx][w]=Math.max(pick, notPick);
    // }
    public static void main(String args[]) {
        List<Integer> profit=List.of(1,2,3);
        List<Integer> weight=List.of(4,5,1);
        int w=4, n=profit.size();
        int prev[]=new int[w+1];
        int curr[]=new int[w+1];
        // int dp[][]=new int[n+1][w+1];
        // for(int i=0; i<=n; i++) 
        // for(int j=0; j<=w; j++) 
        // dp[i][j]=-1;
        for(int i=0; i<=w; i++) {
            if(weight.get(0)<=i) 
            prev[i]=profit.get(0);
            else 
            prev[i]=0;
        }
        for(int idx=1; idx<n; idx++) {
            for(int wt=0; wt<=w; wt++) {
                int pick=-10000;
                if(wt>=weight.get(idx))
                pick=profit.get(idx)+prev[wt-weight.get(idx)];
                int notPick=prev[wt];
                curr[wt]=Math.max(pick, notPick);
            }
            System.arraycopy(curr, 0, prev, 0, w+1);
        }
        System.out.println(prev[w]);
    }
}
