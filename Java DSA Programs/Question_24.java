//Given an array, print all its elements using recursion
public class Question_24 {
    static void printArray(int arr[], int idx)
    {
        if(idx==arr.length)
        return ;
        System.out.print(arr[idx]+"    ");
        printArray(arr, idx+1);
    }    
    public static void main(String args[])
    {
        int arr[]=Question_1.inputArray();
        printArray(arr, 0);
    }
}
