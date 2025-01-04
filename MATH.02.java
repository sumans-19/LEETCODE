// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, return the nth ugly number.

CODE =>
  class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglySet=new TreeSet<>();
        long curr=1;
        uglySet.add(1l);
        while(n-->0)
        {
            curr=uglySet.removeFirst();
            uglySet.add(curr*2l);
            uglySet.add(curr*3l);
            uglySet.add(curr*5l);
        }
        return (int)curr;
    }
}


Time Complexity: 
O(nlogn)
Space Complexity: 
O(n)
