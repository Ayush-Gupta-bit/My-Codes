/* Insertion Sort : Take one element from unsorted part of array, iterate through the sorted part of array and find the correct
   position for this element. It is a stable algorithm. 
   Time Complexity : O(n) --> Best Case 
                     O(n^2) --> Average and Worst Case
   Space Complexity : O(1)  */
public class Question_40 {
    static void insertionSort(int a[])
    {
        int n=a.length;
        for(int i=1; i<n; i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                a[j]+=a[j-1];
                a[j-1]=a[j]-a[j-1];
                a[j]-=a[j-1];
                j--;
            }
        }
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("Sorted Array : ");
        insertionSort(a);
        Question_1.printArray(a);
    }
}
