class Solution {
    public int maxProfit(int[] a) {
        int n= a.length;
        if(n==1){
            return 0;
        }
        int max= 0;
        int i =1;
        int diff=0;
        int buy=a[0];
        while(i<n){
            if(a[i]<buy){
                buy=a[i];
            }else if(a[i]-buy>max){
                max = a[i]-buy;
            }
            i++;
        }
        return max;
    }
}