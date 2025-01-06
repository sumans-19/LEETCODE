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


// Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

  CODE=>
  class Solution {
    public int calculate(String s) {
        int sum = 0;
        int sign = 1;
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int val = 0;
                 while(i < s.length() && Character.isDigit(s.charAt(i))){
                     val = val * 10 + (s.charAt(i) - '0');
                     i++;
                 }
             i--;
             val = val * sign;
             sign = 1;
             sum += val;   
            }
            else if(ch == '('){
              st.push(sum);
              st.push(sign);
                sum = 0;
                sign = 1;
            }
            else if(ch == ')'){
                sum *= st.pop();
                sum += st.pop();
            }
            else if(ch == '-'){
                sign*= -1;
            }
        }
        return sum;
    }
}

Java Solution using Stack with O(n)
The algorithm is efficient, with linear time complexity and space complexity depending on the depth of parentheses.
  Space Complexity: O(d)
  Time Complexity: O(n)


