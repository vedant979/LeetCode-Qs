class Solution {
    public int[] replaceElements(int[] arr) {
        // int temp = arr[arr.length-1];
        // arr[arr.length-1] = -1;
        int max=Integer.MIN_VALUE;
        int[]newA = new int[arr.length];
        newA[newA.length-1] = -1;
        for(int i=arr.length-2;i>=0;i--){
            int before = arr[i+1];
            max = Math.max(max, before);
            newA[i]=max;    
        }   
        return newA;
    }
}