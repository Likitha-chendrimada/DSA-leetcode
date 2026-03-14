/*
Problem #977 :
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

Approach:
Use the two-pointer technique. Compare the absolute values at the
start and end of the array, place the larger square at the end of
the result array, and move the corresponding pointer inward.
*/

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }

            pos--;
        }

        return result;
    }
}
