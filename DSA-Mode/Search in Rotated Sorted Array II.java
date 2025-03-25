class Solution {
    public boolean search(int[] nums, int target) {
        int sol = searchhh(nums,target);
        if(sol != -1){
            return true;
        }
        else{
            return false;
        }
    }
    int searchhh(int[] nums,int target){
        int pivot = findpivot(nums);
        //if u dont have pivot 
        if(pivot == -1){
            //normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found we have 2ascending arrays : 
        // now we have 3 cases :
        if(nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }


    public int binarySearch(int[] nums, int target,int start , int end) {

        while(start<=end){
             int mid = start + (end-start) /2;
             if(target<nums[mid]){
                end = mid-1;
             } else if (target > nums[mid]){
                start = mid+1;
             }
             else{
                return mid;
             }

        }
        return -1;

    }

int findpivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid-1;
        }

        // if elements at middle, start, end are equal then just skip the duplicates
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            // skip the duplicates
            // NOTE: what if these elements at start and end were the pivot??
            // check if start is pivot
            if (start < end && arr[start] > arr[start + 1]) {
                return start;
            }
            start++;

            // check whether end is pivot
            if (start < end && arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        }
        // left side is sorted, so pivot should be in right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}
}


