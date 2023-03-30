class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int number=0;
            for(int j=0;j<accounts[i].length;j++){
                number+=accounts[i][j];
            }
            if(wealth<=number){
                wealth=number;
            }
            
        }  
        return wealth;
    }
}