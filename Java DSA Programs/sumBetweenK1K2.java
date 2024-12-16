/* Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. It may be  assumed that (1<=K1<K2<=N). */

import java.util.*;
public class sumBetweenK1K2 {
    public static void main(String args[]) {
        List<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int k1=3, k2=6;
        for(int i=0; i<arr.size(); i++) {
            pq.add(arr.get(i));
            if(pq.size()>k2) {
                pq.remove();
            }
        }
        pq.remove();
        int sum=0;
        while(pq.size()!=k1) {
            sum+=pq.remove();
        }
        System.out.println(sum);

    }
}
