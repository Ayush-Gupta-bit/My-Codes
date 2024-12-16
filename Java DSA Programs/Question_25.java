// Print maximum value of array using recursion
public class Question_25 {
    static int maxElement(int []arr, int idx)
    {
        if(idx==arr.length-1)
        return arr[idx];
        int smallAns=maxElement(arr, idx+1);
        return Math.max(arr[idx], smallAns);
    }    
    public static void main(String args [])
    {
        int arr[]=Question_1.inputArray();
        System.out.print("Entered Array : ");
        Question_1.printArray(arr);
        System.out.println("Maximum value in the array : "+maxElement(arr,0));
    }
}
