class Solution {
    public int search(int[] a, int k) {
        int n = a.length;
        int start = 0;
        int end = a.length-1;
        int min = 0;

        while(start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
 
            if(a[mid]<a[next] && a[mid]<a[prev]){
                min = mid;
                break;
            }else if(a[start]<a[end]){
                min = start;
                break;
            }else if(a[mid]>=a[start]){
                start = mid+1;
            }else if(a[mid]<=a[end]){
                end = mid-1;
            }

        }
        System.out.println(a[min]);
        if(a[min]==k){
            return min;
        }
        int start1 = 0;
        int end1 = min-1;
        while(start1<=end1){
            int mid = start1+(end1-start1)/2;
            if(a[mid]==k){
                return mid;
            }else if(k<a[mid]){
                end1 = mid-1;
            }else{
                start1 = mid+1;
            }
        } 
        int start2 = min;
        int end2 = a.length-1;
        while(start2<=end2){
            int mid = start2+(end2-start2)/2;
            if(a[mid]==k){
                return mid;
            }else if(k<a[mid]){
                end2 = mid-1;
            }else{
                start2 = mid+1;
            }
        }
        return -1;
    }
}