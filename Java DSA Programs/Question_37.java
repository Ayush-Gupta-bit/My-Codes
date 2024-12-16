/* Bubble Sort : We do a certain number of passes and in every pass, we compare adjacent elements and swap them if they are not in 
   correct order. In eveery iteration, the largest number in part of array to be processed gets its correct position. It is an 
   in-place, stable sorting algorithm.
   Time Complexity : O(n^2) --> for best, average and worst case 
   
   Modified Bubble Sort : We take a variable to check if any swaps happened or not inside j loop. If no swaps happened, it implies
   the array is already sorted, so loop is terminated. It is an in-place, stable sorting algorithm.
   Time Complexity : O(n) --> for Best Case and O(n^2) --> for Average and Worst Case */
public class Question_37 {
    static void bubbleSort(int a[])
    {
        int n=a.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j+1]+=a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]-=a[j];
                }       
            }
        }
    }
    static void modifiedBubbleSort(int a[])
    {
        int n=a.length;
        for(int i=0; i<n-1; i++)
        {
            boolean flag = false;
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j+1]+=a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]-=a[j];
                    flag=true;
                }       
            }
            if(!flag)
            return;
        }
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("Sorted Array using Modified Bubble Sort : ");
        modifiedBubbleSort(a);
        Question_1.printArray(a);
    }
}
