import java.util.*;
public class Question_8 {
    /*Given an array of integers of size n. Answer q queries where you need to print sum of values in a given range of indices from
      l to r. */
      public static void main (String args[])
      {
        try (Scanner sc = new Scanner (System.in)) {
          int arr[], pref[];
          arr=Question_1.inputArray();
          pref=Question_7.prefixSumArray(arr);
          System.out.print("Enter number of Queries : ");
          int q= sc.nextInt();
          while(q>0)
          {
              System.out.print("Enter lower bound :");
              int l = sc.nextInt();
              System.out.print("Enter upper bound :");
              int r = sc.nextInt();
              System.out.println("Sum :"+(pref[r]-pref[l-1]));
              q--;
          }
        }


      }
    
}
