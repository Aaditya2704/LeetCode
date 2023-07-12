class Solution {
    public int subtractProductAndSum(int n) {
        int k=n;
        int product=1,sum=0;
        while(k!=0){
            int rem=k%10;
            product*=rem;
            sum+=rem;
            k/=10;
        }
        return (product-sum);
    }
}