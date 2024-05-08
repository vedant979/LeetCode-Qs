class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0 || (nums.length==1 && nums[0]==val)){
            return 0;
        }
        int i =0;
        int j=0;
        while(i<nums.length){
            if(nums[j]!=val){
                j++;
                i=j+1;
            }else if(nums[i]==val){
                i++;
            }else if(nums[j]==val && nums[i]!=val && i>=j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
        // System.out.println(nums.length-(i-j+1));
        for( i= 0;i<nums.length;i++){
            if(nums[i]==val){
                return i;
            }
        }
        return nums.length;
    }
}