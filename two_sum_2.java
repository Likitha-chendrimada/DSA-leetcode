/*
Problem #167:
Find two numbers in a sorted array whose sum equals the target. Return their 1-based indices.

Approach:
   Use Two Pointers:
Start left at beginning, right at end
If sum == target return indices
If sum < target move left++
If sum > target move right--

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } 
            else if (sum < target) {
                left++;  // increase sum
            } 
            else {
                right--; // decrease sum
            }
        }
        return new int[]{-1, -1};
    }
}
