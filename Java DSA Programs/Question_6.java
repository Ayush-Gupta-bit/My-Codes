public class Question_6 {
    /*Given an integer array 'arr' sorted in non-decreasing order. Return an array of squares of each number sorted in non-decreasing
      order.*/
      public static int []sortSquares(int []arr)
      {
        int n=arr.length, left=0, right=n-1, k=0;
        int ans[] = new int [n];
        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else
            {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        Question_1.reverseArray(ans);
        return ans;
      }
      public static void main (String args[])
      {
        int a[];
        a=Question_1.inputArray();
        System.out.println("Original Array");
        Question_1.printArray(a);
        a=sortSquares(a);
        System.out.println("Sorted Array");
        Question_1.printArray(a);
      }

    
}
