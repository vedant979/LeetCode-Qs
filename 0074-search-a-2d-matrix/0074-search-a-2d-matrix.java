class Solution {
    public boolean searchMatrix(int[][] m, int k) {
        for(int i =0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}