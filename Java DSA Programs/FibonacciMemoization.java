public class FibonacciMemoization {
    static long calls=0;
    private static long fibo(int n, long dp[]) {
        if(n==1 || n==0) 
        return 1;
        if(dp[n]!=-1) 
        return dp[n];
        calls++;
        return dp[n]=fibo(n-1, dp) + fibo(n-2, dp);
    }
    public static void main(String args[]) {
        long x[]=new long[101];
        for(int i=0; i<101; i++) 
        x[i]=-1;
        fibo(100, x);
        System.out.println(x[100]);
        System.out.println(calls);
    }
    
}
