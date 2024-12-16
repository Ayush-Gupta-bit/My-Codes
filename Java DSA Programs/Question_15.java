//Given a nXm matrix, print it in spiral order
public class Question_15 {
    static void printSpiralOrder(int [][]matrix, int r, int c)
    {
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements=0;
        while(totalElements < r*c)
        {
            for(int j=leftCol; j<=rightCol && totalElements<r*c; j++)
            {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            for(int i=topRow; i<=bottomRow && totalElements<r*c; i++)
            {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol && totalElements<r*c; j--)
            {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            for(int i=bottomRow; i>=topRow&&totalElements<r*c; i--)
            {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String args[])
    {
        int arr[][]=Question_10.inputMatrix();
        System.out.println("Original Matrix ...\n");
        Question_10.printMatrix(arr);
        System.out.print("\nMatrix elements in Spiral Order : ");
        printSpiralOrder(arr, arr.length, arr[0].length);
    }
    
}
