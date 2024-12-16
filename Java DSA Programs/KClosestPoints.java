/* You are given a set of points in  a XY plane. You need to find the K closest points to the origin using Manhattan distance. */

import java.util.*;
public class KClosestPoints {
    private static class Point{
        int x;
        int y;
        int distance;
    }
    private static class PointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if(p1.distance>p2.distance) return 1;
            else if(p1.distance<p2.distance) return -1;
            else return 0;
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Point> ans=new PriorityQueue<>(new PointComparator());

    }
}
