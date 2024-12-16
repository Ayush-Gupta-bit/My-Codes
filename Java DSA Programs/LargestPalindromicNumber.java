/* Given N(very large), the task is to print the largest palindromic number obtained by permuting the digits of N. If it is not possible to make a palindromic number, then print an appropriate message.
 
  Input: 313551
  Output: 531135
 
 */

import java.util.*;

public class LargestPalindromicNumber {
    public static void main(String args[]) {
        String number = "301103333";
        List<Integer> frequency = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            frequency.add(0);
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            frequency.set(digit, frequency.get(digit) + 1);
        }
        if(!validate(frequency)) {
            System.out.println("Palindrome not possible");
            return;
        }
        String firstHalf="";
        for(int i=9; i>=0; i--) {
            while(frequency.get(i)>1) {
                firstHalf+=i;
                frequency.set(i, frequency.get(i)-2);
            }
        }
        StringBuilder sb=new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf=sb.toString();
        for(int i=9; i>=0; i--) {
            if(frequency.get(i)==1) 
            firstHalf+=i;
        }
        String result=firstHalf+secondHalf;
        System.out.println(result);

    }

    private static boolean validate(List<Integer> frequency) {
        boolean isOdd=false;
        for(int i=0; i<frequency.size(); i++) {
            if(frequency.get(i)%2!=0) {
                if(isOdd==true) 
                return false;
                isOdd=true;
            }
        }
        return true;
    }
}