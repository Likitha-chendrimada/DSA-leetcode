/*
Problem #169:
Given an array nums, find the majority element that appears more than ⌊n/2⌋ times.

Approach:
Initialize candidate and count=0
Traverse array:update candidate when count==0, increment if same element, else decrement
Final candidate is the majority element

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0; 
        int count = 0;
        // Traverse the array
        for (int num:nums) {

            // If count becomes 0, choose a new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // If current element is same as candidate, increase count
            if (num == candidate) {
                count++;
            } else {
                // Otherwise, decrease count
                count--;
            }
        }
        // The final candidate is the majority element
        return candidate;
    }
}
