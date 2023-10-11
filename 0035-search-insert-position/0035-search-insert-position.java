class Solution {
    public int searchInsert(int[] num, int target) {
        int lo = 0;
        int hi = num.length-1;
        if(target<num[lo]){
            return lo;
        }
        else if(target>num[hi]){
            return hi+1;
        }
        else{
            while(lo!=hi){
                int mid = lo+(hi-lo)/2;
                if(num[lo]<target && num[hi]>target){
                    if(hi-lo==1){
                        return lo+1;
                    }
                }
                if(num[mid]==target){
                    return mid;
                }
                if(num[mid]<target){
                    lo = mid+1;
                }else{
                    hi = mid;
                }
            }
        }
        if(num[lo]==target){
            return lo;
        }else{
            return hi;
        }
    }
}