 /*
     Problem:
     Given a 2D array where each row represents a customer and each column
     represents the money in their bank accounts, return the maximum wealth
     among all customers.
  */

class Solution {

    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        // Iterate through each customer
        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            // Calculate wealth of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Update maximum wealth
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }
}
