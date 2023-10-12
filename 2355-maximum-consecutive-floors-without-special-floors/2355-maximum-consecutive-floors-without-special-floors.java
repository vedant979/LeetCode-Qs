class Solution {
    public int maxConsecutive(int bottom, int top, int[] a) {
        int count =0;
        // int max = -1;
        // int []arr = new int[top-bottom+1];
        // int x = bottom; 
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = x++;
        // }

        // for(int i= 0;i<a.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[j]==a[i]){
        //             arr[j] = -1;
        //         }
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i]!=-1){
        //         count++;
        //     }else{
        //         max = Math.max(max, count);
        //         count=0;
        //     }
        // }
//-----Solution-2------
        // Arrays.sort(a);
        // int i =0;
        // for(int j = bottom;j<=top;j++){
        //     if(i==a.length){
        //         i = a.length-1;
        //     }
        //     if(a[i]!=j){
        //         count++;
        //     }else{
        //         max = Math.max(max, count);
        //         count =0;
        //         i++;
        //     }
        // }
        // if(count!=0 && count>max){
        //     max = count;
        // }
//SOLUTION-3
        Arrays.sort(a);
        int max = Math.max(a[0]-bottom, top-a[a.length-1]);
        for(int i=1;i<a.length;i++){
            max = Math.max(max, a[i]-a[i-1]-1);
        }


        return max;
    }
}