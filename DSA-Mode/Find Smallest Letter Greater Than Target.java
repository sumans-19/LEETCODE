public class Leet06 {
    public static void main(String[] args) {
        char[] arr = {'c','f','l','o'};
        char target = 'z';
        char ans = search(arr, target);
        System.out.println(ans);



    }
    public static char search(char[] nums, char target) {
        int len = nums.length;
        int start = 0;
        int end = len-1;

        while(start<=end){
             int mid = start + (end-start) /2;
             if(target<nums[mid]){
                end = mid-1;
             } else if (target > nums[mid]){
                start = mid+1;
             }
             else{
                start = mid+1;
             }

        }
        return nums[start % len];

    }

}
