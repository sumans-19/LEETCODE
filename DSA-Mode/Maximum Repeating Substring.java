class Solution {
    public int maxRepeating(String sequence, String word) {
        int maxRepeating = 0;
        StringBuilder sb = new StringBuilder(word);

        while (sequence.contains(sb.toString())) {
            maxRepeating++;
            sb.append(word);
        }

        return maxRepeating;
    }
}
