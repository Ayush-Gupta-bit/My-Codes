// Find sum of array elements using recursion
public class Question_26 {
    static int sumOfArray(int arr[], int idx)
    {
        if(idx==arr.length)
        return 0;
        int smallAns=sumOfArray(arr, idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String args[])
    {
        int arr[]=Question_1.inputArray();
        System.out.print("Entered Array : ");
        Question_1.printArray(arr);
        System.out.println("Sum of Elements of the Array : "+sumOfArray(arr, 0));
    }
}
