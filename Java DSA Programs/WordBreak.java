
/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words. The same word in the dictionary may be reused multiple times in the segmentation.
 * 
 * Input: s="applepenapple"
 *        n=2
 *        wordDict=["apple", "pen"]
 * Output: True
 * 
 * Input: s="catsandog"
 *        n=5
 *        wordDict=["cats", "dog", "sand", "and", "cat"]
 * Output: False
 * 
 */

 import java.util.*;
public class WordBreak {
    // private static int rec(int idx, String s, List<String> wordDict, int[] dp) {
    //     if(idx==s.length()) 
    //     return 1;
    //     if(dp[idx]!=-1) 
    //     return dp[idx];
        
    //     for(int i=idx; i<s.length(); i++) {
    //         String prefix=s.substring(idx, i+1);
    //         if(wordDict.contains(prefix)) {
    //             if(rec(i+1, s, wordDict, dp)==1) 
    //             return dp[idx]=1;
    //             else 
    //             return dp[idx]=0;
    //         }
    //     }
    //     return dp[idx]=0;
    // }
    public static void main(String args[]) {
        String s="applepenapple";
        List<String> wordDict=List.of("apple", "pen");
        int n=s.length();
        int dp[]=new int[n+1];
        dp[n]=1;
        // for(int i=0; i<n; i++) 
        // dp[i]=-1;
        // System.out.println(rec(0, s, wordDict, dp));
        for(int idx=n-1; idx>=0; idx--)
        {for(int i=idx; i<s.length(); i++) {
            String prefix=s.substring(idx, i+1);
            if(wordDict.contains(prefix)) {
                if(dp[i+1]==1) 
                dp[idx]=1;
            }
        }
    }
        System.out.println(dp[0]);
    }
}
