class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int i =0;
        int j = 0;
        int n = arr.length;
        ArrayList<Integer>a = new ArrayList<>();
        if(n==1){
            return 1;
        }
        while(j<n-1){
            if(arr[j]>arr[j+1]){
                a.add(0);
            }else if(arr[j]<arr[j+1]){
                a.add(1);
            }else{
                a.add(-1);
            }
            j++;
        }

        int count= 1;
        int flag = -1;
        int max = Integer.MIN_VALUE;
        if(a.size()==1){
            if(a.get(0)==1 ||a.get(0)==0  ){
                return 2;
            }else{
                return 1;
            }
        }
        int x = 0;

        while(x<a.size()){
            if(a.get(x)==-1){
                x++;
            }else{
                break;
            }
        }
        if(x==a.size()){
            return 1;
        }
        i=x;
        j=x+1;
        while(j<a.size()){
            if(a.get(j)==-1){
                System.out.println(j);
                max = Math.max(max, j-i+1);
                j++;
                i=j;
            }
             else if(a.get(j)!=a.get(j-1)){
                j++;
            }else{
                max = Math.max(max, j-i+1);
                i= j;
                j++;
            }
        } 
        if(i<j){
            max = Math.max(max, j-i+1);
        }     

        return max;
    }
}