/*

Problem # 11: 
Given an array of heights, choose two lines that form a container with the x-axis.
Return the maximum water (area) that can be stored between any two lines.

Approach:
Use two pointers at the start and end, calculate area = min(height) * width.
Move the pointer with smaller height to try getting a larger area.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int minHeight;

            if (height[left] < height[right]) {
                minHeight = height[left];
                left++;   // move smaller one
            } else {
                minHeight = height[right];
                right--; 
            }

            int area = minHeight * width;
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
