class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();

        char ch[] = s.toCharArray();
        int max = 0;
        int len=0;
        for(int i=0;i<ch.length;i++){
            char hash[] = new char[255];
            for(int j=i;j<ch.length;j++){
                if(hash[ch[j]]==1){
                    // System.out.println(str+" "+j+" "+i);
                    break;
                } 
                    len = j-i+1;
                    max = Math.max(max,len);
                    hash[ch[j]]=1;
            }
        }
    return max;
    }
}