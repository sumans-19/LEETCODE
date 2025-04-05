class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int i = 0;
        List<Integer> list = new ArrayList<Integer>();
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
        // search for missing number:
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                list.add(nums[j]);
                }
        }
        return list; 
    }
}
