// Program to rotate the matrix by 90 degrees
public class Question_13 
{
    static void rotate(int [][] matrix, int n)
    {
        Question_12.transposeInPlace(matrix, n, n);
        for(int i=0; i<n; i++)
        Question_1.reverseArray(matrix[i]);
    }
    public static void main(String args[])
    {
        int matrix[][]=Question_10.inputMatrix();
        System.out.println("\nOriginal Matrix ...\n");
        Question_10.printMatrix(matrix);
        System.out.println("\nRotated Matrix ...\n");
        rotate(matrix, matrix.length);
        Question_10.printMatrix(matrix);
    }
}