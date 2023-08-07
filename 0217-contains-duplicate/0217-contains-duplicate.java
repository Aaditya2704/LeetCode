class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        int n=nums.length;
        for(int i:nums)h.add(i);
        
        int k=h.size();
        if(n==k)return false;
        else return true;
    }
}