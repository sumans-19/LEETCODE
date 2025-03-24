/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index
        int peak = findPeak(mountainArr, n);
        
        // Step 2: Search in the increasing part
        int index = binarySearch(mountainArr, 0, peak, target, true);
        if (index != -1) return index;
        
        // Step 3: Search in the decreasing part
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }
    
    private int findPeak(MountainArray mountainArr, int n) {
        int left = 0, right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;  // Move right
            } else {
                right = mid;  // Move left
            }
        }
        return left;  // Peak index
    }
    
    private int binarySearch(MountainArray mountainArr, int left, int right, int target, boolean isAscending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) return mid;
            
            if (isAscending) {
                if (midValue < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (midValue > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;  // Target not found
    }
}
