class Solution {
    public void sortColors(int[] a) {
        int lo=0;
        int hi=a.length-1;
        int mid =0;

        while(mid<=hi){
            if(a[mid]==0){
                int temp = a[mid];
                a[mid] = a[lo];
                a[lo] = temp;
                mid++;
                lo++;               
            }else if(a[mid]==1){
                mid++;
            }else if(a[mid]==2){
                int temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                // mid++;
            }

        }
    }
}