class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int []map = new int[101];  
        for(int x : nums){
            map[x]++; 
        }
        for(int i=1;i<map.length;i++){
            map[i] += map[i-1]; // prefix sum 
        }
        int []res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[i] = map[nums[i]-1]; // answer will be stored in previous index
            }
        }
        return res;
    }
}