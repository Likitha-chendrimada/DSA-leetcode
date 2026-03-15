/*
Problem #283:
Given an integer array nums, move all 0's to the end of it while maintaining 
the relative order of the non-zero elements. You must do this in-place without making 
a copy of the array.

Approach:
- Use a two-pointer technique
  1. Maintain an insert position pointer to track where the next non-zero 
     element should be placed.
  2. Traverse the array and move all non-zero elements to the front.
  3. Fill the rest of the array with zeros.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
