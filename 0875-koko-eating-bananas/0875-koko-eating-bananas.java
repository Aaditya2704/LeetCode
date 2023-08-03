class Solution {
    
    public static int sumOfD(int []piles,int div){
        int n=piles.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)piles[i]/(double)div);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
         int n=piles.length;
        if(n>h)return -1;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1,high=max;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(sumOfD(piles,mid)<=h)high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}