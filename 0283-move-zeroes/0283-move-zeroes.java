class Solution {
    public void moveZeroes(int[] a) {
        int i= 0;
        int j=0;
        int n = a.length;

        while(j<n){
            if(a[i]!=0){
                i++;
                j++;
            }else{
                if(a[i]==0 && a[j]!=0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }
        }
    }
}