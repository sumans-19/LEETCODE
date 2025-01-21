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



// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
// Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
// You may assume that you have an infinite number of each kind of coin.

CODE =>
  class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
    }
}


// Complexity:
// Time Complexity: 
// 𝑂(amount × coins.length)
// O(amount×coins.length), since we iterate over all amounts and all coins.
// Space Complexity: 
// 𝑂(amount)
// O(amount), as we use a single array of size amount + 1.



The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
such that each number is the sum of the two preceding ones, starting from 0 and 1. 


CODE =?
  class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int i = fib(n-1);
        int j = fib(n-2);
        return i + j;
    }
}


// or 

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}

