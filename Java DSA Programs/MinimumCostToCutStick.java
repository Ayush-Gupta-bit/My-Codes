/*Given a wooden stick of length n units. The stick is labeled from 0 to n. Given an integer array cuts of length c, where cuts[i] denotes a position you should perform a cut at. You should perform the cuts in order, you can change the order of the cuts as you wish.
 * The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks i.e., the sum of their lengths is the length of the stick before cut. Return the minimum total cost of the cuts.
 * 
 * Input: n=7, c=4, cuts[]=[1, 3, 4, 5]
 * Output: 16
 * Explanation: Consider the order [3, 5, 1, 4]
 * 
 * Input: n=9, c=5, cuts[]=[5, 6, 1, 4, 2]
 * Output: 22
 * Explanation: Consider the order [4, 6, 5, 2, 1]
 * 
 */

import java.util.*;
public class MinimumCostToCutStick {
    // public static int rec(int i, int j, List<Integer> cuts, int [][]dp) {
    //     if(dp[i][j]!=-1) 
    //     return dp[i][j];
    //     if(i>j) 
    //     return 0;
    //     int minimum=999999;
    //     for(int k=i; k<=j; k++) {
    //         int cost=rec(i, k-1, cuts, dp)+rec(k+1, j, cuts, dp) + cuts.get(j+1)-cuts.get(i-1);
    //         minimum=Math.min(minimum, cost);
    //     }
    //     return dp[i][j]=minimum;
    // }
    public static void main(String args[]) {
        List<Integer> cut=List.of(1, 3, 4, 5);
        List<Integer> cuts=new ArrayList<>();
        int n=7;
        cuts.add(0);
        cuts.addAll(cut);
        cuts.add(n);
        Collections.sort(cuts);
        int c=cut.size();
        int dp[][]=new int [c+2][c+2];
        for(int i=0; i<c+2; i++) 
        for(int j=0; j<=i; j++) 
        dp[i][j]=0;
        for(int i=c; i>=1; i--) {
            for(int j=i; j<=c; j++) {
                int minimum=999999;
        for(int k=i; k<=j; k++) {
            int cost=dp[i][k-1]+dp[k+1][j] + cuts.get(j+1)-cuts.get(i-1);
            minimum=Math.min(minimum, cost);
        }
        dp[i][j]=minimum;
            }
        }
        System.out.println(dp[1][c]);
    }
}
