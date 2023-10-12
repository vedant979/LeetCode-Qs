class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int i =0;
        int j =1;
        if(nums.length==1){
            return 0;
        }
        while(i<nums.length-1){
            if(j==nums.length){
                i++;
                j = i+1;
            }
            System.out.println(i+" "+j);
            if(j!=nums.length){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            j++;
        }
        return count;
    }
}