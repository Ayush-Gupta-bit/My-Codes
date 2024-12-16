/*Given an array of integers, print sums of all its subsets in any order. */
public class Question_34 {
    static void subsetSum(int a[], int n, int idx, int sum)
    {
        if(idx>=n)
        {
            System.out.print("  "+sum);
            return;
        }
        subsetSum(a, n, idx+1, sum+a[idx]);
        subsetSum(a, n, idx+1, sum);
    }
    public static void main(String args[])
    {
        int arr[]=Question_1.inputArray();
        Question_1.printArray(arr);
        System.out.print("Sums of all the subsets of the array : ");
        subsetSum(arr, arr.length, 0, 0);
    }
}
