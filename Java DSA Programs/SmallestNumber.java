/*The task is to find the smallest number with the given sum of digits as S and number of digits as D.

Input: S=9, D=2
Output: 18

*/

import java.util.*;
public class SmallestNumber {
    public static void main(String args[]) {
        int S=36, D=4;
        if(S==0 || S>D*9) {
            System.out.println("Not Possible");
            return;
        }
        S-=1;
        List<Integer> number =new ArrayList<>();
        for(int i=0; i<D; i++) 
        number.add(0);
        number.set(0, 1);
        for(int i=D-1; i>0; i--) {
            if(S>9) {
                number.set(i, 9);
                S-=9;
            }
            else {
                number.set(i, S);
                S=0;
                break;
            }
        }
        number.set(0, S+1);
        for(int i=0; i<D; i++) {
            System.out.print(number.get(i));
        }
    }
}
