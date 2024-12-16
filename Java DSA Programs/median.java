/* Given a stream of integers, find the median of the stream using two priority queues. */
import java.util.*;
public class median {
    public static void add(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq, int element) {
        if (leftPq.isEmpty()) {
            leftPq.add(element);
            return;
        }
        if(element<leftPq.peek()) {
             if(rightPq.size()==leftPq.size())
             leftPq.add(element);
             else {
                rightPq.add(leftPq.remove());
                leftPq.add(element);
             }
        }
        else {
            if(rightPq.size()==leftPq.size()) {
                leftPq.add(rightPq.remove());
                rightPq.add(element);
            }
            else 
            rightPq.add(element);
        }
    }
    private static double findMedian(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq) {
        if(leftPq.isEmpty()) 
        return -1;
        else if(leftPq.size()-rightPq.size()==1) 
        return leftPq.peek();
        else 
        return (double)(leftPq.peek()+rightPq.peek())/2;
    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> rightPq = new PriorityQueue<>();
        add(leftPq, rightPq, 15);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 10);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 5);
        add(leftPq, rightPq, 20);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 25);
        System.out.println(findMedian(leftPq, rightPq));
    }
}
