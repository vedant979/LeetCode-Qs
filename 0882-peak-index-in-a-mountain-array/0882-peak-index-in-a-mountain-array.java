class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int start = 1;
        int end= a.length-1;
         while(start!=end){
             int mid = start+(end-start)/2;
             if(a[mid]<a[mid+1]){
                 start = mid+1;
             }else{
                 end = mid;
             }
         }
         return start;
    }
}