class Solution {
    public int majorityElement(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max =0;
        for(int i =0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i], 1);
            }
        }
        int maxCount =0;

        for(Map.Entry<Integer,Integer> ans : map.entrySet()){
        System.out.println(ans.getKey()+" "+ans.getValue());
            if(ans.getValue()>maxCount){
                maxCount = ans.getValue();
                max = ans.getKey();
            }
        }
        return max;
    }
}