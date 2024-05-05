class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int i =0;
        int j =0;

        int max = a[0];
        int sum = 0;
        while(j<n){
            sum+=a[j];
            if(sum>max) max = sum;
            if(sum<0) {
                sum=0;
                i++;
            }
            j++;
        }
        return max;
    }
}