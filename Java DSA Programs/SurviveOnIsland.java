/*
You are a person in an islnad. There is only one shop in this island, this shop is open on all days of the week except for Sunday. Consider the following constraints: 
S-Number of days you are required to survive
N-Maximum unit of food you can buy on each day
M-Unit of food required each day to survive
Currently, it's Monday, and you need to survive for the next 5 days.
Find the minimum number of days on which you need to buy food from the shop so that you can survive for the next S days, or determine that it isn't possible to survive.

Input: S=10, N=16, M=2
Output: Yes
        Minimum days to buy food: 2
 
*/

import java.util.*;
public class SurviveOnIsland {
    public static void main(String args[]) {
        int S=10, N=16, M=2;
        int total_food_required=S*M;
        int result;
        if((M>N) || (S<7 && 7*M>6*N)) 
        result=-1;
        else {
            result=(int)Math.ceil((double)total_food_required/N);
        }
        System.out.println(result);
    }
    
}
