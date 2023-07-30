class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0)
        {return 0;}
        if(nums.length == 1)
        {return nums[0];}
        if(nums.length == 2)
        {return Math.max(nums[0],nums[1]);}
        
        
        int odd = 0;
        int even = 0;
        for (int i : nums) {
            int temp = odd;
            odd= Math.max(odd, even);
            even = i + temp;
        }
        return Math.max(odd, even);
    }
}