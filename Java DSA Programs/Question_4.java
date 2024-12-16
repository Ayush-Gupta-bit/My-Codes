public class Question_4 {
    //Sort an array consisting of only 0s and 1s using two pointers approach
    public static void sortZeroesAndOnes(int []arr)
    {
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                arr[left]+=arr[right];
                arr[right]=arr[left]-arr[right];
                arr[left]=arr[left]-arr[right];
            }
            if(arr[left]==0)
            left++;
            if(arr[right]==1)
            right--;
        }
    }
        public static void main(String args[])
        {
            int arr[];
            arr=Question_1.inputArray();
            System.out.println("Original Array ");
            Question_1.printArray(arr);
            sortZeroesAndOnes(arr);
            System.out.println("Sorted Array");
            Question_1.printArray(arr);

        }
    
    
}
