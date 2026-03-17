/* 
Problem #217:
Given an integer array nums, return true if any element appears more than once, otherwise return false.

Approach:
Traverse the array and store elements in a HashSet.
If an element already exists in the set, return true.
If traversal completes without duplicates, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

