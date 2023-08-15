class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>mp =new HashMap<>();
        
        for(int i:nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }else{
                mp.put(i,1);
            }
        }
        for(int x:mp.keySet()){
            if(mp.get(x)>1) return x;
        }
        return -1;
    }
}