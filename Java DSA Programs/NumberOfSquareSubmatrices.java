/* Given a n x m matrix of ones and zeroes, return how many square submatrices have all ones.
 * 
 * Input: n=3, m=4
 *        matrix=[[0,1,1,1],
 *                [1,1,1,1],
 *                [0,1,1,1]]
 * Output: 15
 * 
 */

public class NumberOfSquareSubmatrices {
    public static void main(String args[]) {
        // List<List<Integer>> grid=new ArrayList<>();
        // grid.add(List.of(0,1,1,1));
        // grid.add(List.of(1,1,1,1));
        // grid.add(List.of(0,1,1,1));
        int [][]grid={{0,1,1,1},{1,1,1,1,},{0,1,1,1}};
        int m=grid.length;
        int n=grid[0].length, ans=0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j]==1 && i>0 && j>0)
                grid[i][j]=1+Math.min(grid[i-1][j], Math.min(grid[i-1][j-1], grid[i][j-1]));                
                ans+=grid[i][j];
            }
        }
        System.out.println(ans);
    }
}