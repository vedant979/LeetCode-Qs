class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int n =a.length;
        if(n==1){
            if(a[0]==1){
                return 1;
            }else{
                return 0;
            }
        }
        int count =0;
        int max = 0;
        for(int i =0;i<n-1;i++){
            if(a[i]==a[i+1] && a[i]==0){
                continue;
            }
            if(a[i]==a[i+1] && a[i]==1){
                count++;
            }else{
                count+=1;
                max = Math.max(max, count);
                count=0;
            }
        }
        if(count>=1){
            count+=1;
            max = Math.max(max, count);
        }
        return max;
    }
}