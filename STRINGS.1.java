// 1} For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. 
// The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
// Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:


CODE=>
class Solution {
    public int romanToInt(String s) {
        int sum = 0, prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanCharToValue(s.charAt(i));
            if (currentValue < prevValue) {
                sum -= currentValue; 
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }
        return sum;
    }
    
    private int romanCharToValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        }
    }
}

// 2}Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.

bool isValid(char* s) {
    int l =strlen(s);
    char stack[l];
    int top = -1;
    for(int i=0;i<l;i++){
        if(s[i]=='(' || s[i] == '{' || s[i] == '[' ){
            stack[++top] = s[i];
        }else{
            if(top == -1 ||( s[i]==')'&&stack[top] != '(')||(s[i]=='}'&&stack[top] != '{')||(s[i]==']'&&stack[top]!='[')){
                return false;
            } 
            top--;
        } 
    }  
    return top == -1; 
}



// 3}Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }
}
