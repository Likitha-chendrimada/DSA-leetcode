/*
     Problem #1480:
     Given an array nums, return the running sum of the array.
     The running sum at index i is the sum of all elements from index 0 to i.
     
     Approach:
     Traverse the array starting from index 1.
     At each index, add the previous element to the current element.
     This updates the array in-place to store the running sum.

     Time complexity: O(n) — We traverse the array once.
     Space complexity: O(1) — The running sum is computed in-place without extra space. 
    */
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Add the previous element to the current element
            nums[i] = nums[i] + nums[i - 1];
        }
        // Return the array containing sums.
        return nums;
    }
}
