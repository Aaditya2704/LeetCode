class Solution {
    public int countKDifference(int[] nums, int k) {
            int pairs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]-nums[j]==k)pairs++;
            }
        }
        return pairs;
    }
}