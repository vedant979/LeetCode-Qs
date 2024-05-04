class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int m = a1.length;
        int n = a2.length;
        int[]arr = new int[m+n];
        double median=0;
        int i =0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(a1[i]<a2[j]){
                arr[k++] = a1[i];
                i++;
            }else if(a1[i]==a2[j]){
                arr[k++] = a1[i];
                arr[k++] = a2[j];
                i++;
                j++;
            }else{
                arr[k++] = a2[j];
                j++;
            }
        }
        if(i<m){
            for(int x=i;x<m;x++){
                arr[k++] = a1[x];
            }
        }
        else if(j<n){
            for(int x=j;x<n;x++){
                arr[k++] = a2[x];
            }
        }
        int len = arr.length;
        // System.out.println(arr[(0+(arr.length-1-0)/2)]+" "+arr[arr.length/2]+arr[arr.length/2-1])/2);
        if(len%2==0){
            return (double)(arr[arr.length/2]+arr[arr.length/2-1])/2;

        }else{
            return (double)arr[(0+(arr.length-1-0)/2)];

        }
         
    }
}