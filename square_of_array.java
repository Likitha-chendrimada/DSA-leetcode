/*

Problem #977:
Given a sorted array, return a new array of squares of each element, also sorted in non-decreasing order.

Approach:
Use two pointers at the start and end, compare absolute values, and fill the result array from the back with the larger square.

Complexity:
Time: O(n)
Space: O(n)

*/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0, right = n - 1;
        int pos = n - 1;
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        
        return result;
    }
}

