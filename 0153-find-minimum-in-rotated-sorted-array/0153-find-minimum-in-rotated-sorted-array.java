class Solution {
    public int findMin(int[] a) {
        if(a.length==1){
            return a[0];
        }
        int n = a.length;
        int start = 0;
        int end = a.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;

            if(a[mid]<a[next] && a[mid]<a[prev]){
                return a[mid];
            }else if(a[start]<a[end]){
                return a[start];
            }else if(a[mid]>=a[start]){
                start = mid+1;
            }else if(a[mid]<=a[end]){
                end = mid-1;
            }

        }
        return -1; 
    }
}