// q> Find the number closest to n and divisible by m
// Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

// Examples: 
// Input: n = 13, m = 4
// Output: 12
// Explanation: 12 is the closest to 13, divisible by 4.

// Input: n = -15, m = 6
// Output: -18
// Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.

package Logical;

import java.util.*;

public class closenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to which it has to be nearer");
        int n = sc.nextInt();
        System.out.println("Enter a number to which it should be divisible");
        int m = sc.nextInt();
        int ans = closestNumber(n,m);
        System.out.println(ans);
        
    }
    static int closestNumber(int n, int m)  {
        // find the quotient
        int q = n / m;
        // 1st possible closest number
        int n1 = m * q;
        // 2nd possible closest number
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        // if true, then n1 is the required closest number
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        
        // else n2 is the required closest number    
        return n2;    
    }
}
