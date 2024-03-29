class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:banned)set.add(i);
        int sum=0,cnt=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                continue;
            }
            sum+=i;
            cnt++;
            if(sum>maxSum)return cnt-1;
        }
        return cnt;
    }
}