class Solution {
    public int maximumGap(int[] a) {
        int diff = 0;
        int max = Integer.MIN_VALUE;
        if(a.length==1){
            return 0;
        }
        Arrays.sort(a);
        for(int i =0;i<a.length-1;i++){
            if(a[i]<=a[i+1]){
                diff = a[i+1]-a[i];
                max = Math.max(max, diff);
            }
        }
        // if(max==Integer.MIN_VALUE){
        //     return 0;
        // }
        return max;

    }
}