class Solution {
    public static int findDays(int []weights,int cap){
        int days=1,load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(weights[i]+load>cap){
                days+=1;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0,max=0;
        for(int i=0;i<n;i++)sum+=weights[i];
        
        for(int i:weights)max=Math.max(max,i);
        
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int noOfDays=findDays(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}