class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwelath = 0; 
        for(int row =0 ;row<accounts.length;row++){
            int currwealth=0;
            for(int col=0 ; col<accounts[0].length;col++){
                currwealth += accounts[row][col];
            }
            maxwelath = Math.max(currwealth, maxwelath);
        }

        return maxwelath;

    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] accounts = { { 1, 5 }, { 7, 2 }};
        System.out.println(s.maximumWealth(accounts));
    }
}
