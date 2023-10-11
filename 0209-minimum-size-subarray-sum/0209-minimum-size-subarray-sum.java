class Solution {
    public int minSubArrayLen(int k, int[] a) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<a.length){
            sum+=a[j];
            if(sum<k){
                j++;
            }
            else if(sum==k){
                min = Math.min(min, j-i+1);
                j++;
            }
            if(sum>k){
                while(sum>=k){
                    sum-=a[i];
                    i++;
                }
                // if(sum==k){
                    min = Math.min(min, j-i+2);
                // }
                j++;
            }

        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}