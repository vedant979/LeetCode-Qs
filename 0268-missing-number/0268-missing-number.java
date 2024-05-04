import java.util.*;
class Solution {
    public int missingNumber(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i!=a[i])
            {   
                return i;
            }
        }
        return n;
    }
}