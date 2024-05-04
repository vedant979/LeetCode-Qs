import java.util.*;
class Solution {
    public int singleNumber(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}