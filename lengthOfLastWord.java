/*

Problem #58:
Given a string with words and spaces, find the length of the last word.
A word is a sequence of non-space characters.

Approach:
First remove extra spaces at the end using trim().
Traverse from the end and count characters until a space is found.

Complexity
Time: O(n)
Space: O(1)

*/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // remove spaces from start and end
        int count = 0;
        // start from last character
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;   // stop when space comes
            }
            count++;
        }
        return count;
    }
}
