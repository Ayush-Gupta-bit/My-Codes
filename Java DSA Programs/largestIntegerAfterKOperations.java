/* Given an array of n integers. You are supposed to perform k operations on it. At each operation, the smallest 2 elements of the array are removed from the array, multiplied from the array, multiplied by each other, and the product is added back to the array.
 * Return the largest element of the array after the k operations.
 * It is guaranteed that atleast one element will remain after the k operations. */

import java.util.*;
public class largestIntegerAfterKOperations {
    public static void main(String args[]) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        PriorityQueue<Integer> pq=new PriorityQueue<>(arr);
        int k=3;
        for(int i=0; i<k; i++) {
            int f=pq.remove();
            int s=pq.remove();
            pq.add(f*s);
        }
        while(pq.size()!=1) {
            pq.remove();
        }
        System.out.println(pq.peek());
    }
    
}
