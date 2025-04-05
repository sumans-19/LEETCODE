class Solution {
    public int missingNumber(int[] nums) {
            int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                // swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        // search for missing number:
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
                }
        }
        return nums.length;
    }
}



or 

  class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i<=nums.length;i++){
            totalSum += i;
        }

        int actualSum = 0;
        for(int j = 0; j<nums.length; j++){
            actualSum += nums[j];
        }

        return totalSum-actualSum;
    }
}
