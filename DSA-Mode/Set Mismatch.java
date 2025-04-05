class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] arr = {-1,-1};
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                // swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }
}
