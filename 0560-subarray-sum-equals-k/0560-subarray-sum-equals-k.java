class Solution {
    public int subarraySum(int[] n, int k) {
        int sum =0;
        int count =0;

        for(int i=0;i<n.length;i++){
            sum = n[i];
        if(sum==k){
                    count++;
                
        }
            for(int j=i+1;j<n.length;j++){
                sum+=n[j];
                if(sum==k){
                    count++;
                }
            }

    }
    return count;
    }
}