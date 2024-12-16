// Rotate array by k steps without using extra space
import java.util.*;
public class Question_3 {
    public static void reverseArray ( int arr[] , int start , int end )
    {
        while ( start < end )
        {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }

    }
    public static void rotateInPlace(int []arr , int k)
    {
        int n = arr.length;
        k%=n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void main (String args[])
    {
        try (Scanner sc = new Scanner (System.in)) {
            int arr[];
            arr=Question_1.inputArray();
            System.out.print(" Enter the number of steps by which the array is to be rotated : ");
            int k = sc.nextInt();
            System.out.println("Original Array");
            Question_1.printArray(arr);
            rotateInPlace(arr,k);
            System.out.println("Rotated Array ");
            Question_1.printArray(arr);
        }
    }

    
}
