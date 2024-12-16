/* Merge Sort : It uses " Divide and Conquer " approach [ Recursion ].
1. Divide the array into two equal halves
2. Sort the two subarrays separately using recursion
3. Merge the two sorted subarrays to create an overall sorted array
  Time Complexity : O(nlogn) --> for best, average and worst cases
  Space Complexity : O(n)
  It is a stable algorithm */
  
public class Question_43 {
    static void merge (int []arr, int l, int mid, int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int []left=new int[n1];
        int right[]=new int[n2];
        int i, j, k;
        for(i=0; i<n1; i++)
        left[i]=arr[l+i];
        for(j=0; j<n2; j++)
        right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            arr[k++]=left[i++];
            else
            arr[k++]=right[j++];
        }
        while(i<n1)
        arr[k++]=left[i++];
        while(j<n2)
        arr[k++]=right[j++];
    }
    static void mergeSort(int []arr, int l, int r)
    {
        if(l>=r)
        return;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("Sorted Array : ");
        mergeSort(a, 0, a.length-1);
        Question_1.printArray(a);
    }
}
