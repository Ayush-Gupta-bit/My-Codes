//Given an integer n, return the first n rows of the Pascal's Triangle
import java.util.*;
public class Question_14 {
    static int[][] pascal (int n)
    {
        int ans[][]= new int [n][];
        for(int i=0; i<n; i++)
        {
            ans[i]=new int [i+1];
            ans[i][0] = ans[i][i]= 1;
            for(int j=1; j<i; j++)
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }
        return ans;
    }
    static void printPascal(int [][]arr)
    {
        int s = arr.length;
        for(int i=0; i<arr.length; i++)
        {
            int j = arr[i].length-1;
            for(int k=0; k<s; k++)
                System.out.print("  ");
            s--;
            for(; j>=0; j--)
            {
                if(arr[i][j]/10==0)
                System.out.print(arr[i][j]+"   ");
                else if(arr[i][j]/10>0&&arr[i][j]/10<10)
                System.out.print(arr[i][j]+"  ");
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String args[])
    {
        try(Scanner sc = new Scanner (System.in))
        {
            System.out.print("Enter the number of rows : ");
            int n = sc.nextInt();
            int arr[][] = pascal(n);
            printPascal(arr);
        }
    }
}