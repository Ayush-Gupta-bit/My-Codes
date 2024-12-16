//Program to return transpose of a matrix
public class Question_11 {
public static int[][] transposeMatrix(int [][]arr, int r, int c)
{
    int [][] transpose=new int [c][r];
    for(int i=0; i<c; i++)
    {
        for(int j=0; j<r; j++)
            transpose[i][j]=arr[j][i];
    }
    return transpose;
}
    public static void main(String args[])
    {
        int arr[][]=Question_10.inputMatrix();
        System.out.println("Original Matrix...\n\n");
        Question_10.printMatrix(arr);
        int Transpose[][]=transposeMatrix(arr,arr.length, arr[0].length);
        System.out.println("\n\nTransposed Matrix...\n\n");
        Question_10.printMatrix(Transpose);
    }
}
