class Solution {
    public int climbStairs(int n) {
        int climbSecondLastStair = 0;
        int climbLastStair = 1;
        int climbCurrentStair = 1;
        for(int i = 1; i <= n; i++) {
            climbCurrentStair = climbSecondLastStair + climbLastStair;
            climbSecondLastStair = climbLastStair;
            climbLastStair = climbCurrentStair;
        }
        return climbCurrentStair;
    }
}