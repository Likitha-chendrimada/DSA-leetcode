/*
Problem
Given a sorted array, remove duplicates in-place so each element appears only once and return the count of unique elements k.

Approach:
Use two pointers, one (i) for placing unique elements and another (j) for traversal.
Whenever a new element different from nums[i] is found, increment i and copy nums[j] to nums[i].

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums){
        // Edge case
        if (nums.length == 0) return 0;
        int i = 0; // pointer for unique element
        // Traverse array
        for (int j = 1; j < nums.length; j++){
            // If new unique element found
            if (nums[j] != nums[i]) {
                i++; // move pointer
                nums[i] = nums[j]; // place unique element
            }
        }
        // Number of unique elements
        return i + 1;
    }
}
