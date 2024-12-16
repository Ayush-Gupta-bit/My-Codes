/* Given an input string s and pattern p, implement regular expression matching with support for '.' and '*' where : 
 * '.' Matches any single character
 * '*' Matches zero or more of the preceding element
 * The matching should cover the entire input string (not partial).
 * 
 * Input: s="aa", p="a"
 * Output: False
 * 
 * Input: s="abbbac", p=".*a*"
 * Output: True
 * 
 */

public class RegexMatching {
    private static boolean rec(int i, int j, String s, String p) {
        if(j==-1 || i==-1) 
        return true;
        if(j==-1 && i>=0) 
        return false;
        if(i==-1 && j>=0) {
            for(int x=0; x<=j; x++) {
                if(p.charAt(x)!='*') 
                return false;
            }
            return true;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') 
        return rec(i-1, j-1, s, p);
        else if(p.charAt(j)=='*') {
            return rec(i, j-1, s, p) || rec(i-1, j, s, p);
        }
        else 
        return false;
    }
    public static void main(String args[]) {
        String s="abbbac", p="*a*.";
        System.out.println(rec(s.length()-1, p.length()-1, s, p));
    }
    
}
