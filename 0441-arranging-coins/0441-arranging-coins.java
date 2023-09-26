class Solution {
    public int arrangeCoins(int n) {
        int i=1,j=0;
        while(n>=0){
            n-=i;
            i+=1;
            j+=1;
        }
        return j-1;
    }
}