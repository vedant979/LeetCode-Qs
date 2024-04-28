class Solution {
    public int removeDuplicates(int[] a) {
        int j=0;
        int count = 0;
        for(int i =0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j++] = a[i];
                // count++;
            }
        }
        a[j] = a[a.length-1];
        // count++;
        // System.out.println(a.length-count);

        return j+1;
    }
}