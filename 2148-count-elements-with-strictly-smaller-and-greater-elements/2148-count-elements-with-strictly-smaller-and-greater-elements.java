class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[0]<nums[i]&&nums[nums.length-1]>nums[i])k++;
        }
        return k;
    }
}