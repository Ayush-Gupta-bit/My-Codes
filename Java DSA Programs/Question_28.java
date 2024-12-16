//Given an array and an integer 'x', return all the indices of the array where 'x' is present in the array
import java.util.*;
public class Question_28 {
    static ArrayList<Integer> allIndices(int a[], int n, int x, int idx)
    {
        if(idx>=n)
        return new ArrayList<Integer>();
        ArrayList<Integer>ans = new ArrayList<>();
        if(a[idx]==x)
        ans.add(idx);
        ArrayList<Integer> smallAns=allIndices(a, n, x, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the integer to be searched in the array : ");
            int n=sc.nextInt();
            int arr[]=Question_1.inputArray();
            Question_1.printArray(arr);
            System.out.print("All the indices of the array where the entered integer is present : "+allIndices(arr, arr.length, n, 0));
        }
    }
}
