/*
     Problem:
     Given an array of integers nums, return the count of numbers
     that contain an even number of digits.

     Approach:
     Iterate through each number in the array. For every number,
     count how many digits it has. If the number of digits is even,
     increase the counter. Finally, return the total count.

     Time complexity: O(n×d)
     Space complexity: O(1)
*/

class Solution {

    public int findNumbers(int[] nums) {
        int count = 0;

        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = 0;

            // Count digits of the number
            while (num > 0) {
                digits++;
                num /= 10;
            }
            // Check whether digit count is even
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
