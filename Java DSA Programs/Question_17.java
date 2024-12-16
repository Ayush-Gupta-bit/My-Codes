/*Given a matrix 'a' of dimensions nXm and two coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to 
(l2,r2) */
import java.util.*;
public class Question_17 {
    static void prefixSumMatrix(int [][]matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0; i<r; i++) //Rowise Sum
        {
            for(int j=1; j<c; j++)
            matrix[i][j]+=matrix[i][j-1];
        }
        for(int j=0; j<c; j++) //Columnwise Sum
        {
            for(int i=1; i<r; i++)
            matrix[i][j]+=matrix[i-1][j];
        }
    }
    static int findSum(int [][]matrix, int l1, int r1, int l2, int r2)
    {
        int ans=0, sum=0, up=0, left=0, leftUp=0;
        prefixSumMatrix(matrix);
        sum=matrix[l2][r2];
        if(r1>=1)
        left=matrix[l2][r1-1];
        if(l1>=1)
        up=matrix[l1-1][r2];
        if(l1>=1&&r1>=1)
        leftUp=matrix[l1-1][r1-1];
        ans=sum-up-left+leftUp;
        return ans;
    }
    public static void main(String args[])
    {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Enter coordinates of upper left end of rectangle ...");
            int l1=in.nextInt();
            int r1=in.nextInt();
            System.out.println("Enter coordinates of bottom right end of rectangle ...");
            int l2=in.nextInt();
            int r2=in.nextInt();
            int arr[][]=Question_10.inputMatrix();
            System.out.println();
            Question_10.printMatrix(arr);
            int sum=findSum(arr,l1,r1,l2,r2);
            System.out.print("\nSum of elements inside the rectangle : "+sum);
        }
    }
}
