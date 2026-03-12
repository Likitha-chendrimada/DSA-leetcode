 /*
     Problem:
     Given an array of integers nums and an integer target, return the indices 
     of the two numbers such that they add up to the target.
     Each input has exactly one solution, and the same element cannot be used twice.
     The answer can be returned in any order.

     Approach:
     Use a HashMap to store the numbers we have seen so far along with their indices.
     For each element in the array, calculate the complement (target - current number).
     If the complement already exists in the map, we have found the two numbers
     that add up to the target, so return their indices.
     Otherwise, store the current number and its index in the map and continue.

     Time complexity: O(n) — We traverse the array only once.
     Space complexity: O(n) — Extra space is used for the HashMap to store elements.
*/

import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number as key and its index as value
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // Find the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {

                // If found, return the indices of complement and current element
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        // Return empty array if no solution found
        return new int[]{};
    }
}
