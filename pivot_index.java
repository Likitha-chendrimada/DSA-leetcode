/*
Problem #724:
Given an integer array nums, find the pivot index where the sum of elements on the left is equal to the sum of elements on the right.
Return the leftmost pivot index, or -1 if it does not exist.

Approach:
Find total sum
Traverse while keeping leftSum
Check: leftSum == totalSum- l eftSum - nums[i]
If true return index, else update leftSum

Complexity:
Time: O(n)
Space: O(1)
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        // Find pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
