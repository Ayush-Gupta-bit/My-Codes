//Reverse an array without using another array
import java.util.*;
public class Question_1 {
    public static void reverseArray(int []arr)
    {
        int i=0,j=arr.length-1;
        while (i<j)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
    public static int [] inputArray()
    {
        try (Scanner sc = new Scanner ( System.in)) {
            System.out.print("Enter the size of an Array : ");
            int n = sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter an Integer : ");
                arr[i]=sc.nextInt();
            }
            return arr;
        }

    }
    public static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] ;
        arr = inputArray();
        System.out.println("\nOriginal Array ");
        printArray(arr);
        System.out.println("\nReversed Array ");
        reverseArray(arr);
        printArray(arr);
    }
    
}
