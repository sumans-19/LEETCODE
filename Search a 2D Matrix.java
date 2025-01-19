You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

CODE=>
  class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
    int[] arr1 = new int[arr.length * arr[0].length];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr1[k++] = arr[i][j];
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == target){
                    return true;
                }
                
            }
            return false;
    }
}


Overall, the time complexity is:
O(m×n)+O(m×n)=O(m×n)

Overall, the space complexity is
O(m×n)



  
or 
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}


Time Complexity:
O(log(m×n)): Binary search over  m×n elements.
  
Space Complexity:
O(1): No additional space is used apart from variables.
