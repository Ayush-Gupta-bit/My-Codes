/* Catalan Numbers are defined as a mathematical sequence that consists of positive integers, which can be used to find the number of possibilities of various combinations.
 * The first few Catalan Numbers are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, ...
 * Given a number n, print the nth Catalan Number.
 * 
 * Input: n=6
 * Output: 42
 * 
 * Input: n=8
 * Output: 429
 * 
 */

public class CatalanNumbers {
    // private static int catalan(int n) {
    //     if(n==0 || n==1) 
    //     return 1;
    //     int answer=0;
    //     for(int i=0; i<n; i++){
    //         answer+=catalan(i)*catalan(n-i-1);
    //     }
    //     return answer;
    // }

    public static void main(String args[]) {
        int n=6;
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int j=2; j<=n; j++) {
            for(int i=0; i<j; i++) 
            dp[j]+=dp[i]*dp[j-i-1];
        }
        System.out.println(dp[n-1]);
    }
}
