// Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

CODE => 
  public class Solution {
    public int maxScore(String inputStr) {
        int totalOnes = 0;
        int zerosCount = 0;
        int onesCount = 0;
        int bestScore = Integer.MIN_VALUE;

        // Count total ones in the string
        for (char ch : inputStr.toCharArray()) {
            if (ch == '1') totalOnes++;
        }

        // Traverse the string and calculate scores
        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == '0') zerosCount++;
            else onesCount++;

            // Calculate score
            int currentScore = zerosCount + (totalOnes - onesCount);
            bestScore = Math.max(bestScore, currentScore);

        }

        return bestScore;
    }
}


// Complexity
// Time Complexity:

// Counting the total number of '1's requires (O(n)), where (n) is the length of the string.
// Traversing the string to calculate the score also requires (O(n)).
// Total time complexity: (O(n)).
// Space Complexity:

// Only a few integer variables (onesCount, zerosCount, totalOnes, and bestScore) are used.
// Total space complexity: (O(1)).
