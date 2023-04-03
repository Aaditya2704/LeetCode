class Solution {
    public int differenceOfSum(int[] nums) {
     int elementSum = 0;
        int digitSum = 0;

        for(int n : nums){
            
            elementSum += n; 
                while(n != 0){
                
                int rem = n%10;
                digitSum += rem;
                n = n/10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}