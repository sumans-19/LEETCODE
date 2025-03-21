class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // If the middle element is greater than the next, the peak is on the left
                right = mid;
            } else {
                // If the middle element is less than the next, the peak is on the right
                left = mid + 1;
            }
        }

        return left; // `left` will point to a peak element
    }
}
