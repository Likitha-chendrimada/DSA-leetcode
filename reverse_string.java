/*

Problem #344: 
Given a character array s, reverse the string.

Approach:
Use two pointers: one at the start and one at the end.
Swap elements and move pointers inward until they meet.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
          
            // swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // move pointers
            left++;
            right--;
        }
    }
}
