public class Question_7 {
    //Return prefix sum in same array
    public static int []prefixSumArray(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        arr[i]+=arr[i-1];
        return arr;
    }
    public static void main (String args[])
    {
        int arr[];
        arr=Question_1.inputArray();
        System.out.println("\nOriginal Array ...");
        Question_1.printArray(arr);
        System.out.println("\nPrefix Sum Array ...");
        arr=prefixSumArray(arr);
        Question_1.printArray(arr);
    }
    
}
