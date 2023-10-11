class Solution {
    public int[] twoSum(int[] a, int target) {
        int [] arr = new int[2];
        int sum=0;
        int n = a.length;
        int i=0;
        int j=n-1;
        while(i<j){
        sum=a[i]+a[j];
            if(sum==target){
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
            if(sum<target){
                sum-=a[i];
                i++;
            }
            else if(sum>target){
                sum-=a[j];
                j--;
            }


        }
        return arr;
    }
}