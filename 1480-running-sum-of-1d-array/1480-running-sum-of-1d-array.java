class Solution {
    public int[] runningSum(int[] nums) {
        int length=nums.length;
        int answer=0;
        int [] runningSum=new int[length];
        for(int i=0;i<length;i++){
            answer+=nums[i];
            runningSum[i]=answer;
        }
        return runningSum;
    }
}