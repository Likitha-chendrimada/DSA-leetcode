/*
Problem #88:
Given two sorted arrays nums1 (size m + n) and nums2 (size n), merge nums2 into nums1 such that the final array is sorted. The result must be stored in-place in nums1.

Approach:
Use 3 pointers:
i = m - 1 (end of valid nums1)
j = n - 1 (end of nums2)
k = m + n - 1 (end of nums1)
Compare elements from the back and place the larger one at position k.
If elements remain in nums2, copy them.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        
        int j = n - 1;    
        int k = m + n - 1;
        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
