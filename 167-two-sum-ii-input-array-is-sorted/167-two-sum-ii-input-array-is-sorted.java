class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        int res[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(mp.containsKey(target-numbers[i])){
                res[1]=i+1;
                res[0]=mp.get(target-numbers[i])+1;
            }else{
                mp.put(numbers[i],i);
            }
        }
        return res;
    }
}