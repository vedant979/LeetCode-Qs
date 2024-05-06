import java.util.*;
class Solution {
    public int findDuplicate(int[] a) {
        int n = a.length;
        Map<Integer, Integer>map = new HashMap<>();

        for(int i =0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>1){
                return key;
            }
        }
        return 0;
    }
}