class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatInTime(piles, mid, h)) {
                right = mid - 1;  
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    private boolean canEatInTime(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k);  
        }
        return hours <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
