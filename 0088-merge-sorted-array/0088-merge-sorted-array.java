class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {
        // if(m==1 && n==0){
        //     return a1;
        // }else if(m==0 && n==1){
        //     return a2;
        // }
        int ptr =m;
        // int i=0;
        int j=0;
        for(int i=m;i<a1.length;i++){
            if(a1[i]==0){
                a1[i] = a2[j++];
               System.out.println(a1[i]+" "+j);  
            }
        }
        Arrays.sort(a1);
    }
}