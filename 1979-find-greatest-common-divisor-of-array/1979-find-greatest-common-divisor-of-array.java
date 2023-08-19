class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        while(min!=max){
            if(min>max)min=min-max;
            else max=max-min;
        }
        return max;
    }
}