// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] 
// for each 0 <= i < nums.length and return it.
// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).


public class BuildArray {
    public int[] buildArray(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i < l; i++) {
            ans[i] = nums[nums[i]];
            }
            return ans;
    }
    public static void main(String[] args) {
        BuildArray leet01 = new BuildArray();
        int[] nums = {0,2,1,5,3,4};
        int ans[] = leet01.buildArray(nums);
        for(int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
            }
    }
}
