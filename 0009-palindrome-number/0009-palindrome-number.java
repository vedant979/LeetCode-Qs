class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}