// Program to return transpose of a matrix without using extra space
public class Question_12 
{
    static void transposeInPlace(int [][]matrix, int r, int c)
    {
        for(int i=0; i<r; i++)
        {
            for(int j=i; j<c; j++)
            {
                if(i!=j)
                {
                    matrix[i][j]+=matrix[j][i];
                    matrix[j][i]=matrix[i][j]-matrix[j][i];
                    matrix[i][j]=matrix[i][j]-matrix[j][i];
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[][] = Question_10.inputMatrix();
        System.out.println("Original Matrix...\n\n");
        Question_10.printMatrix(arr);
        transposeInPlace(arr,arr.length, arr[0].length);
        System.out.println("\n\nTransposed Matrix...\n\n");
        Question_10.printMatrix(arr);
    }
}
