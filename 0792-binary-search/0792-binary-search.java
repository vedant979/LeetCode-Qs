class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while(j-i>1){
            int mid= i+(j-i)/2;
           if(nums[mid]<target){
                i = mid+1;
            }
            else{
                j = mid;
            }
        }
        if(nums[i]==target){
            return i;
        }
        if(nums[j]==target){
            return j;
        }

        return -1;
    }
}