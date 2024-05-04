class Solution {
    public int search(int[] a, int k) {
        int start = 0;
        int end = a.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(a[mid]==k){
                return mid;
            }else if(k<a[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}