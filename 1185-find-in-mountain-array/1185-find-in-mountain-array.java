/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int k, MountainArray a) {
        
        int start = 1;
        int end = a.length()-2;

        //Finding peak element
        while(start!=end){
            int mid = start+(end-start)/2;
            if(a.get(mid)<a.get(mid+1)){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        int max = start;
        int start1 = 0;
        int end1 = max;

        while(start1<=end1){
            int mid = start1+(end1-start1)/2;
            if(a.get(mid)==k){
                return mid;
            }else if(k>a.get(mid)){
                start1 = mid+1;
            }else{
                end1=  mid-1;
            }

        }
        int start2 = start+1;
        int end2 = a.length()-1;

        while(start2<=end2){
            int mid = start2+(end2-start2)/2;

            if(a.get(mid)==k){
                return mid;
            }else if(k>a.get(mid)){
                end2 = mid-1;
            }else{
                start2 = mid+1;
            }
        }
        return -1;
    }
}