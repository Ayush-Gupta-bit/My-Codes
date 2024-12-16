/* Given an integer array nums and an integer K, return the kth largest element in the array. Note that it is the Kth largest element in the sorted order, not the Kth distinct element.
 * Example:   Input - nums=[3,7,2,9,5]
 *                    k=3
 *            Output - 5
 */


import java.util.*;
public class KthLargestElement {
    public static void main(String args[]) {
        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<arr.size(); i++) {
            if(pq.size()==k) {
                if(pq.peek()<arr.get(i)) {
                    pq.remove();
                    pq.add(arr.get(i));
                }
                continue;
            }
            pq.add(arr.get(i));
        }
        System.out.println(pq.peek());
    }
}
