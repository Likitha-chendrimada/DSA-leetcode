/*
Problem #53:
Given an integer array nums, find the contiguous subarray that has the largest sum and return its sum.

Approach (Kadane’s Algorithm):
Traverse the array while maintaining a running sum.
If the running sum becomes negative, reset it to 0, and keep updating the maximum sum found so far.

Time Complexity: O(N)

Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for(int num : nums){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
