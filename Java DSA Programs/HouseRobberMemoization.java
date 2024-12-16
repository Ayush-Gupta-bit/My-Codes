/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent house have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * 
 * Input: nums=[1,2,3,1]
 * Output: 4
 * 
 * Input: nums=[2,7,9,3,1]
 * Output: 12
 * 
 */

public class HouseRobberMemoization {
    public static int rob(int[] houses, int ind, int dp[]) {
        if(ind==houses.length-1) 
        return houses[ind];
        if(ind>houses.length-1) 
        return 0;
        if(dp[ind]!=-1) 
        return dp[ind];
        int pick=houses[ind]+rob(houses, ind+2, dp);
        int notPick=rob(houses, ind+1, dp);
        return dp[ind]=Math.max(pick, notPick);
    }
    public static void main(String args[]) {
        int houses[]={9,1,3,8};
        int dp[]=new int[houses.length];
        for(int i=0; i<dp.length; i++) 
        dp[i]=-1;
        System.out.println(rob(houses, 0, dp));
    }
}
