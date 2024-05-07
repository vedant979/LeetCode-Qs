import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();

        char ch[] = s.toCharArray();
        int max = 0;
        int len=0;
        int hash[] = new int[255];
        Arrays.fill(hash,-1);
        int i=0;
        int j=0;
        while(j<n){
            if(hash[ch[j]]!=-1){
                if(hash[ch[j]]>=i){
                    i=hash[ch[j]]+1;
                }

            }
            len = j-i+1;
            max = Math.max(max, len);
            hash[ch[j]] = j;
            j++;
        }
    return max;
    }
}