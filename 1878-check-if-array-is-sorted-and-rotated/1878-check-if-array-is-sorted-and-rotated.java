class Solution {
    public boolean check(int[] nums) {
        int inv = 0;

        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inv++;
            }
        }
        if(inv==1 && nums[nums.length-1]<=nums[0]){
            return true;
        }
        if(inv==0){
            return true;
        }
        return false;
    }
}