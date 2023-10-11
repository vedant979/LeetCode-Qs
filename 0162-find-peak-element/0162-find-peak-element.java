class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }
}