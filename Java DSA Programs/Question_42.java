// Given an array of names, you are supposed to sort it in lexicographical order using selection sort.
import java.util.*;
public class Question_42 {
    static void sortStringArray(String arr[])
    {
        int n=arr.length;
        for(int i=0; i<n-1; i++)
        {
            int minIdx = i;
            for(int j=i+1; j<n; j++)
            if(arr[j].compareTo(arr[minIdx])<0)
            minIdx=j;
            String temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the size of array : ");
            int n=sc.nextInt();
            String arr[] = new String [n];
            System.out.println("Enter the elements ...");
            for(int i=0; i<n; i++)
            {
                System.out.print("Enter a string : ");
                arr[i]=sc.next();
            }
            System.out.print("Original Array : ");
            for(int i=0; i<n; i++)
            System.out.print(arr[i]+"   ");
            System.out.print("\nSorted Array : ");
            sortStringArray(arr);
            for(int i=0; i<n; i++)
            System.out.print(arr[i]+"   ");
        }
    }
}
