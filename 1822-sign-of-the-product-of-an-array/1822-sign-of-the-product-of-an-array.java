class Solution {
    public int arraySign(int[] nums) {
        for(int i:nums) if(i==0) return 0;
        int negative=0;
        for(int i:nums)if(i<0)negative++;
        if(negative%2==0)return 1;
        else return -1;
    }
}