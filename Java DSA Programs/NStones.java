/* There are N stones, numbered 1,2,...,N. The height of ith stone is h. There is a frog who is initially on stone 1. He will repeat an action some number of times to reach the stone N. The action is that if the frog is currently on stone i, it jumps to one of the following : 
 * Stone i+1, i+2, ..., i+k. Here a cost of |hi - hj| is incurred, where j is the stone to land on.
 * Find the minimum possible total cost incurred before the frog reaches stone N.
 * 
 * Input: n=5, k=3
 *        10 30 40 50 20
 * Output: 30
 * 
 * Input: 3 1
 *        10 20 10
 * Output: 20
 */

import java.util.*;
public class NStones {
    // private static int rec(int i, List<Integer> heights, int k, int []dp) {
    //     if(dp[i]!=-1) 
    //     return dp[i];
    //     if(i==0) 
    //     return 0;
    //     int minCost=100000;
    //     for(int j=1; j<=k; j++) {
    //         if(i-j>=0) {
    //             int jump=Math.abs(heights.get(i)-heights.get(i-j))+rec(i-j, heights, k, dp);
    //             minCost=Math.min(minCost, jump);
    //         }
    //     }
    //     return dp[i]=minCost;
    // }
    public static void main(String args[]) {
        List<Integer> heights=List.of(10,30,40,50,20);
        int k=3, n=heights.size();
        List<Integer> dp=new ArrayList<>();
        // for(int i=0; i<n; i++) 
        // dp[i]=-1;
        dp.add(0);
        
        for(int i=1; i<n; i++)
        {
            int minCost=100000;
            for(int j=1; j<=k; j++) {
            if(i-j>=0) {
                int jump=Math.abs(heights.get(i)-heights.get(i-j))+dp.get(dp.size()-j);
                minCost=Math.min(minCost, jump);
                }
            }
                if(dp.size()==k) 
                dp.remove(0);
                dp.add(minCost);
        }
        System.out.println(dp.get(k-1));
    }
    
}
