class Solution {
    public int[] twoSum(int[] a, int k) {
        int[]arr = new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    // return 
                    arr[0] = i;
                    arr[1] = j;
                    return arr; 
                }
            }
        }
        return arr;
    }
}