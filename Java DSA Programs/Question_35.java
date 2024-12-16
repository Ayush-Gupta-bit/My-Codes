/* There are N stones numbered 0, 1, 2, 3, ..., N-1. For each i (0<=i<=N), the height of the stone i is hi. There is a frog who is 
initially at stone 0. He will repeat the following action some number of times to reach the stone N-1 ...
If the frog is currently on stone i, he can jump to stone i+1 or stone i+2. Here the cose of |hi - hj| is incurred, where j is the
stone to land on. Fint the minimum possible total cost incurred before the frog reaches the stone N-1. */ 
public class Question_35 {
    static int minCost(int []h, int n, int idx)
    {
        if(idx==n-1)
        return 0;
        int op1=minCost(h, n, idx+1) + Math.abs(h[idx+1]-h[idx]);
        if(idx==n-2)
        return op1;
        int op2=minCost(h, n, idx+2) + Math.abs(h[idx+2]-h[idx]);
        return Math.min(op1, op2);
    }
    public static void main(String args[])
    {
        int arr[]=Question_1.inputArray();
        System.out.println("Minimum cost to reach the stone "+(arr.length-1)+" : "+minCost(arr, arr.length, 0));
    }
}
