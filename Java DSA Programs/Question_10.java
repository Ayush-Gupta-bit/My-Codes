//Program to multiply two matrices
import java.util.*;
public class Question_10 {
    public static int [][]inputMatrix()
    {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter number of Rows :");
                int r=sc.nextInt();
                System.out.print("Enter number of Columns :");
                int c=sc.nextInt();
                int arr[][]=new int [r][c];
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print("Enter an Integer :");
                        arr[i][j]=sc.nextInt();
                    }
                }
                return arr;
            }
        
    }
    public static void printMatrix(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]/10==0)
                System.out.print(arr[i][j]+ "   ");
                else if(arr[i][j]/10>0&&arr[i][j]/10<10)
                System.out.print(arr[i][j]+ "  ");
                else
                System.out.print(arr[i][j]+ " ");

            }
                System.out.println();
        }
    }
    public static void multiplyMatrix(int [][]a, int r1, int c1, int [][]b, int r2, int c2)
    {
        if(c1!=r2)
        {
            System.out.println("Matrix Multiplication Not Possible!!");
            return ;
        }
        int [][]mul = new int [r1][c2];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    mul[i][j]+=a[i][k]*b[k][j];
        System.out.println("Product Matrix...");
        printMatrix(mul);
    }
    public static void main (String args[])
    {
        int arr1[][],arr2[][];
        arr1=inputMatrix();
        printMatrix(arr1);
        System.out.println();
        arr2=inputMatrix();
        printMatrix(arr2);
        System.out.println();
        multiplyMatrix(arr1, arr1.length, arr1[0].length, arr2, arr2.length, arr2[0].length);

    }
    
}
