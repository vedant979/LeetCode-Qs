import java.util.*;
class Solution {
    
    public int longestConsecutive(int[] a) {
        Arrays.sort(a);

        int n = a.length;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int i =0;
        int count=1;
        int max = 1;
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
        while(i<n-1){

            if(a[i+1]-a[i]==1){
                count++;
                i++;
            }
            else if(a[i+1]-a[i]==0){
                i++;
            }else{
                max = Math.max(count,max);
                count=1;
                i++;
            }
            
        }
        System.out.println(i);

        System.out.println(max +" "+count);
            if(i>=n-1){
                max = Math.max(max,count);
            }
        return max;
    }
}