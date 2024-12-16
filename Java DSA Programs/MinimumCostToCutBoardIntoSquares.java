/*A board of length M and width N is given. The task is to break this board into M*N squares such that cost of breaking is minimum. The cutting cost for each edge will be given for the board in two arrays X[] and Y[]. In short, you need to choose such a sequence of cutting such that cost is minimized. Return the minimized cost.
 * 
 * Input: M=6, N=4
 *        X[]={2,1,3,1,4}
 *        Y[]={4,1,2}
 * Output: 42
 * 
 */

import java.util.*;

public class MinimumCostToCutBoardIntoSquares {
    public static void main(String args[]) {
    List<Integer> X=new ArrayList<>();
    List<Integer> Y=new ArrayList<>();
    X.add(2);X.add(1); X.add(3);X.add(1);X.add(4);
    Y.add(4);Y.add(1);Y.add(2);
    int M=6, N=4;
    X.sort(Comparator.reverseOrder());
    Y.sort(Comparator.reverseOrder());
    int numberOfVerticalPiece=1;
    int numberOfHorizontalPiece=1;
    int totalCost=0;
    int i=0, j=0;
    while(i<M-1 && j<N-1) {
        if(X.get(i)>Y.get(j)) {
            totalCost+=X.get(i)*numberOfHorizontalPiece;
            numberOfVerticalPiece++;
            i++;
        }
        else {
            totalCost+=Y.get(j)*numberOfVerticalPiece;
            numberOfHorizontalPiece++;
            j++;
        }
    }
    while(i<M-1) {
        totalCost+=X.get(i)*numberOfHorizontalPiece;
        numberOfVerticalPiece++;
        i++;
    }
    while(j<N-1) {
        totalCost+=Y.get(j)*numberOfVerticalPiece;
        numberOfHorizontalPiece++;
        j++;
    }
    System.out.println(totalCost);
    }

}
