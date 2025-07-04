// 1} Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

=> class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}


// 2} Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

=> class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int i = 0; 
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) { 
                i++; 
                nums[i] = nums[j]; 
            }
        }
        return i + 1; 
   }
}


// 3} Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.Consider the number of elements in nums which are not equal to val be k,
// to get accepted, you need to do the following things

=> class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; 
    }
}

