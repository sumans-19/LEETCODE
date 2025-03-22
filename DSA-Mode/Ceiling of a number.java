public class code06 {     
    public static void main(String[] args) {         
        int[] arr = {2,3,5,9,14,16,18};         
        int target = 19;         
        int ans = search(arr, target);         
        System.out.println(ans);      
    }     

    public static int search(int[] nums, int target) {         
        int len = nums.length;         
        int start = 0;         
        int end = len - 1;          

        while (start <= end) {              
            int mid = start + (end - start) / 2;              
            if (target < nums[mid]) {                 
                end = mid - 1;              
            } else if (target > nums[mid]) {                 
                start = mid + 1;              
            } else {              
                return nums[mid];              
            }          
        }         
       // Edge case: If target is greater than the last element, return -1 (or a custom message)
        if (target > nums[len-1]) {
            return -1; // Indicating no valid ceiling found
        }

        return nums[start];  // Return the ceiling element
    } 
}
