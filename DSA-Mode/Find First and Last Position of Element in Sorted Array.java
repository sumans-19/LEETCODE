import java.util.Arrays;

public class Leet07 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange2(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange2(int[] nums, int target) {
        int[] ans = {-1, -1};  // Default value if target is not found
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;  // Potential answer found
                if (findStartIndex) {
                    end = mid - 1; // Look for the first occurrence
                } else {
                    start = mid + 1; // Look for the last occurrence
                }
            }
        }
        return ans;
    }
}
