import java.util.*;
class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        // int count =0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}