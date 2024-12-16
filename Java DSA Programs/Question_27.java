//Find an element in the array using recursion
import java.util.*;
public class Question_27 {
    static boolean searchArray(int a[], int target, int idx)
    {
        if(idx>=a.length)
        return false;
        if(a[idx]==target)
        return true;
        return searchArray(a, target, idx+1);
    }
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the integer to be searched in the array : ");
            int n=sc.nextInt();
            int arr[]=Question_1.inputArray();
            System.out.print("Entered Array : ");
            Question_1.printArray(arr);
            if(searchArray(arr, n, 0)==true)
            System.out.println("Yes, the entered integer is present in the array.");
            else 
            System.out.println("No, the enetered integer is not present in the array.");
        }
    }
}
