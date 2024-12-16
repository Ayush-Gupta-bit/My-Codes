public class Question_9 {
    /*Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum is equal to the 
      suffix sum of rest of the array. */
      public static int findArraySum(int []arr)
      {
        int total=0;
        for(int i=0; i<arr.length; i++)
            total+=arr[i];
        return total;
      }
      public static boolean equalSumPartition(int []arr)
      {
        int total = findArraySum(arr);
        int prefsum = 0;
        for(int i=0; i<arr.length; i++)
        {
            prefsum+=arr[i];
            int suffixsum=total-prefsum;
            if(suffixsum==prefsum)
            return true;
        }
        return false;
      }
      public static void main (String args[])
      {
        int arr[];
        arr=Question_1.inputArray();
        boolean part=equalSumPartition(arr);
        System.out.println("Is equal Partition possible ?");
        if(part==true)
        System.out.println("YES");
        else
        System.out.println("NO");
      }
    
}
