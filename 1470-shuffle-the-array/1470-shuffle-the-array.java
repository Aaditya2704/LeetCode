class Solution {
    public int[] shuffle(int[] nums, int n) {
        int target[]=new int [nums.length];
        for(int i=0;i<n;i++){
            target[2*i]=nums[i];
            target[2*i+1]=nums[n+i];
        }
        return target;
        
    }
}