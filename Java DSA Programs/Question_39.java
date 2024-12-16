/* Selection Sort : Selects an element and puts it to its correct position. It is an in-place, unstable sorting algorithm. 
   Time Complexity : O(n^2) */
public class Question_39 {
    static void selectionSort(int a[])
    {
        int n = a.length;
        for(int i=0; i<n; i++)
        {
            int minIdx=i;
            for(int j=i+1; j<n; j++)
            if(a[j]<a[minIdx])
            minIdx=j;
            if(minIdx!=i)
            {
                a[minIdx]+=a[i];
                a[i]=a[minIdx]-a[i];
                a[minIdx]-=a[i];
            }
        }
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("Sorted Array : ");
        selectionSort(a);
        Question_1.printArray(a);
    }
}
