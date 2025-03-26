class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if((l.contains(2*arr[i]))|| (arr[i]%2==0 && l.contains(arr[i]/2))){
                return true;
            }
            l.add(arr[i]);
        } 
        return false;
    }
}
