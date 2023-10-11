import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        List<Integer> a = new ArrayList<>();
        int len = 0;
        if(num1.length>=num2.length){
            len = num1.length;
        }else{
            len = num2.length;
        }
        int i = 0;
        int j = 0;

        while(i<num1.length && j<num2.length){
                if(num1[i]<num2[j]){
                    a.add(num1[i]);
                    i++;
                }else if(num1[i]==num2[j]){
                    a.add(num1[i]);
                    a.add(num2[j]);
                    i++;
                    j++;
                }
                else{
                    a.add(num2[j]);
                    j++;
                }
        }
        if(i!=num1.length){
           for(int k = i;k<num1.length;k++){
               a.add( num1[k]);
           }
        }
        if(j!=num2.length){
           for(int k = j;k<num2.length;k++){
               a.add(num2[k]);
           }
        }
        int size = a.size();
        // for(int k=0;k<a.size();k++){
        //     System.out.print(a.get(k)+" ");
        // }
        if(size%2==0){
            if(a.get(size/2)==0 && a.get(size/2-1)==0){
                return 0;
            }
            double a1 = a.get(size/2);
            double a2 = a.get(size/2-1);
            System.out.print(a1+" "+a2);

                return (a1+a2)/2;
            
            // return (a.get(size/2)+a.get(size/2-1))/2;
        }else{
            return (double)(a.get(size/2));
        } 

        // return -1;
    }
}