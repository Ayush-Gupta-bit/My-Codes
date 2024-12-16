//Rotate the array by k steps where k can be greater than length of the array
import java.util.*;
public class Question_2 {
    public static int[]rotate( int arr[] , int k)
    {
        int n = arr.length ;
        k %= n ;
        int [] ans = new int [n] ;
        int j = 0 ;
        for ( int i = n - k ; i < n ; i++ )
            ans[j++] = arr[i] ;
        for ( int i = 0 ; i < n - k ; i++ )
            ans[j++] = arr[i] ;
        return ans ;

    }
    public static void main ( String args [] )
    {
        try (Scanner sc = new Scanner ( System.in )) {
            int arr[] ;
            arr = Question_1.inputArray() ;
            System.out.println("Original Array ");
            Question_1.printArray( arr );
            System.out.print(" Enter the number of steps by which the array is to be rotated : ");
            int k = sc.nextInt();
            arr = rotate( arr , k ) ;
            System.out.println("Rotated Array ");
            Question_1.printArray( arr );
        }
    }
    
}
