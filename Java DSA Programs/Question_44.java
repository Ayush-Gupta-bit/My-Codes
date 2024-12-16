/* Quick Sort : It is also "Divide and Conquer" algorithm.
1. Choose any pivot element
2. Move pivot element to its correct position in the array
3. Put all elements less than pivot element on first half of the array and all elements greater than the pivot element to second half
   of the array
4. Repeat this process until full array is sorted
   Time Complexity : O(nlogn) --> for all cases if pivot is randomised O(n^2) --> worst case if a[0] is taken as pivot element
   Space Complexity : O(1) --> if stack is not considered O(logn) if implicit stack is considered
   It is an unstable algorithm. Java's sorting function is based on this algorithm. */
public class Question_44 {
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String args[])
    {
        int a[]=Question_1.inputArray();
        System.out.print("Original Array : ");
        Question_1.printArray(a);
        System.out.print("Sorted Array : ");
        quickSort(a, 0, a.length-1);
        Question_1.printArray(a);
    }
}
