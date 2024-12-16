import java.util.*;
public class Priority_Queue {
    private static class Student{
        String name;
        Integer rollNo;
        Integer marks;
    }

    private static class StudentComaparator implements Comparator<Student> {
        //over-riding
        public int compare(Student s1, Student s2) {
            if(s1.marks>s2.marks) return 1;
            else if(s1.marks>s2.marks) return -1;
            else {
                if(s1.rollNo>s2.rollNo) return -1;
                else if(s1.rollNo<s2.rollNo) return 1;
                else return 0;
            }
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> studentPriorityQueue=new PriorityQueue<>(new StudentComaparator());
        List<Integer> students=new ArrayList<>();
        Student ayush=new Student();        
        Student Ravish=new Student();        
        ayush.name="Ayush Gupta";
        ayush.marks=94;
        ayush.rollNo=1;
        studentPriorityQueue.add(ayush);
        Ravish.name="Ravish Gupta";
        Ravish.marks=87;
        Ravish.rollNo=1;
        studentPriorityQueue.add(Ravish);
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //min heap by default - top par minimum element rahega
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());//max heap
        PriorityQueue<Integer> pq3=new PriorityQueue<>(pq);
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(7);
        pq.remove(); //removes top element
        // System.out.println(pq.remove());
        // System.out.println(pq.peek());
        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);

    }
}


/* Time Complexities ...
 * add/insert - O(logN)
 * remove/delete - O(logN)
 * peek - O(1)
 */