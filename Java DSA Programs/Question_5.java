public class Question_5 {
    /*Given an array of integers 'arr' . Move all even integers at beginning of the array followed by all odd integers . The relative
     position of odd and even integers does not matter . */
     public static void sortEvensAndOdds(int []arr)
     {
         int n=arr.length;
         int left=0,right=n-1;
         while(left<right)
         {
             if(arr[left]%2==1 && arr[right]%2==0)
             {
                 arr[left]+=arr[right];
                 arr[right]=arr[left]-arr[right];
                 arr[left]=arr[left]-arr[right];
             }
             if(arr[left]%2==0)
             left++;
             if(arr[right]%2==1)
             right--;
         }
     }
         public static void main(String args[])
         {
             int arr[];
             arr=Question_1.inputArray();
             System.out.println("Original Array ");
             Question_1.printArray(arr);
             sortEvensAndOdds(arr);
             System.out.println("Sorted Array");
             Question_1.printArray(arr);
 
         }
    
}
