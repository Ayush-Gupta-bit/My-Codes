/*Given a string s, partition s such that every substring of the partition is a palindrome.Return all possible palindrome partitioning of s.
 * 
 * Input: s="aab"
 * Output: [["a", "a", "b"], ["aa", "b"]]
 * 
 */

import java.util.*;
 public class PalindromePartitioning {
    private static boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<=r) {
            if(s.charAt(l++)!=s.charAt(r--))
            return false;
        }
        return true;
    }
    private static void rec(int idx, String s, List<List<String>> result, List<String> ans) {
        if(idx==s.length()) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx; i<s.length(); i++) {
            String temp=s.substring(idx, i+1);
            if(isPalindrome(temp)) {
                ans.add(temp);
                rec(i+1, s, result, ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    public static void main(String args[]) {
        String s="aab";
        List<List<String>> result=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        int idx=0;
        rec(idx, s, result, ans);
        System.out.println(result);
    }
}
