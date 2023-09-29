class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int j=0; j<nums.length-1; j++) {
            if(nums[j] > nums[j+1]) {
                isIncreasing = false;
            }
            if(nums[j] < nums[j+1]) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}