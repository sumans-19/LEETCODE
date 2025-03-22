public class code07 {
    public static void main(String[] args) {         
        int[] arr = {2,3,5,9,14,16,18};         
        int target = -1;         
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

        // Edge case: If target is smaller than the smallest element, return -1
        if (target < nums[0]) {
            return -1;  
        }

        return nums[end];  // Return the floor element
    }
}
