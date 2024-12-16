import java.util.*;
public class MaximumAreaInHistogram {
    private static int getMaxAreaInHistogram(int []histogram) {
        int n=histogram.length, maxArea=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<=n; i++) {
            while(!s.empty() && (i==n || histogram[i]<histogram[s.peek()])) {
                int height=histogram[s.peek()];
                s.pop();
                int width;
                if(s.empty()) 
                width=i;
                else
                width=i-s.peek()-1;
                int area=height*width;
                maxArea=Math.max(maxArea, area);
            }
            s.push(i);
        }
        return maxArea;
    }
    public static void main(String args[]) {
        int grid[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int m=grid.length, n=grid[0].length, maxAns=0;
        int []histogram=new int[n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) 
            if(grid[i][j]==1) 
            histogram[j]+=1;
            else
            histogram[j]=0;
            int area=getMaxAreaInHistogram(histogram);
            System.out.println(getMaxAreaInHistogram(histogram));
            maxAns=Math.max(area, maxAns);
        } 
        System.out.println("Maximum Area : "+ maxAns);             
    }
}