/*

Problem #50:
Given a number x and integer n, compute x^n  
Handle both positive and negative powers efficiently.

Approach:
Use Binary Exponentiation to reduce computations by squaring the base and halving the exponent.  
If n is negative, convert it using x^(-n) = 1/x^n and proceed.

Time Complexity: O(log n)
Space Complexity: O(1)

*/

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if ((N % 2) == 1) {   // if exponent is odd
                result *= x;
            }
            x *= x;   // square the base
            N /= 2;   // divide exponent by 2
        }
        return result;
    }
}
