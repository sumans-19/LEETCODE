// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

CODE=>
  class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        
        return second;
    }
}


// Complexity:
// Time complexity: O(n)
// Space complexity: O(1)
// This solution efficiently calculates the number of ways to climb n stairs using dynamic programming principles.
