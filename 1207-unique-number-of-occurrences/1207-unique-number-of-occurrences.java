class Solution {
    public boolean uniqueOccurrences(int[] arr) {
           HashMap<Integer,Integer> mp=new HashMap<>();
           HashSet<Integer> map=new HashSet<>();
           for(int i=0;i<arr.length;i++){
                if(!mp.containsKey(arr[i]))mp.put(arr[i],1);
                else mp.put(arr[i],mp.get(arr[i])+1);
            }

        for(var e:mp.keySet()) map.add(mp.get(e));
        
        if(mp.size()==map.size()){
           return true;
        }
         return false;
    }
}