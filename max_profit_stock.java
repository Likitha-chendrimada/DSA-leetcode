
/*
Problem #
Given an array prices[], find the maximum profit by buying on one day and selling on a later day.
Return 0 if no profit can be made.

Approach:
Track the minimum price so far and compute profit for each day.
Update the maximum profit whenever a higher profit is found.

Time Complexity: O(n) 

Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // track minimum price so far
        int maxProfit = 0; // track maximum profit
        
        for (int i = 0; i < prices.length; i++) {
            // update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // calculate profit if sold today
            else {
                int profit = prices[i] - minPrice;
                // update max profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
