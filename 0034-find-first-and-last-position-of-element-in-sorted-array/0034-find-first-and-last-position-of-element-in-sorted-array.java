class Solution {
    public int[] searchRange(int[] a, int k) {
        int start = 0;
        int end = a.length-1;
        int f = -1;
        int l = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==k){
                f = mid;
                end = mid-1;
            }else if(k>a[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        start = 0;
        end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==k){
                l = mid;
                start = mid+1;
            }else if(k>a[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        int[]ab = new int[2];

        ab[0]=  f;
        ab[1]=  l;
        return ab;
    }
}