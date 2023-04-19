class Solution {
    public int maximumCount(int[] nums) {
        int max=0,pos=0,neg=0;
        for(int num:nums){
            if(num>0)pos++;
            if(num<0)neg++;
        }
        max=Math.max(pos,neg);
        return max;
    }
}