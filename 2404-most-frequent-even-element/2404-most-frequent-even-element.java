class Solution {
    public int mostFrequentEven(int[] nums) {
         HashMap<Integer, Integer> map=new HashMap<>();

        for(int i: nums){
            if(i%2==0){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
            }
        }
        int key=-1;
        int max=0;

        for(int i: map.keySet()){
            if(map.get(i)>=max) {
                if (map.get(i) == max && i < key || map.get(i) > max) {
                        max= map.get(i);
                        key=i;
                 }
            }
          
        }
        return  key;
    }
}