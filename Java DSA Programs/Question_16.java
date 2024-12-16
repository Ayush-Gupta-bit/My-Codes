//Given a positive integer 'n', generate a nXn matrix filled with elements from 1 to n*n in spiral order        
import java.util.*;
public class Question_16 {
    static int[][] fillSpiralOrder(int n)
    {
        int matrix[][]= new int [n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int totalElements=1;
        while(totalElements <= n*n)
        {
            for(int j=leftCol; j<=rightCol && totalElements<=n*n; j++)
            {
                matrix[topRow][j]=totalElements;
                totalElements++;
            }
            topRow++;
            for(int i=topRow; i<=bottomRow && totalElements<=n*n; i++)
            {
                matrix[i][rightCol]=totalElements;
                totalElements++;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol && totalElements<=n*n; j--)
            {
                matrix[bottomRow][j]=totalElements;
                totalElements++;
            }
            bottomRow--;
            for(int i=bottomRow; i>=topRow&&totalElements<=n*n; i--)
            {
                matrix[i][leftCol]=totalElements;
                totalElements++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the number : ");
            int n=sc.nextInt();
            System.out.print("\nMatrix filled in Spiral Order ...\n");
            int arr[][]=fillSpiralOrder(n);
            Question_10.printMatrix(arr);
        }
    }
}
