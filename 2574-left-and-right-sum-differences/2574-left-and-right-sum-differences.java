class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int length=nums.length;
        int []leftSum= new int [length];
        int []rightSum=new int [length];
        int []answer=new int [length];
        int leftNumber=0;
        int rightNumber=0;
        leftSum[0]=leftNumber;
        rightSum[length-1]=rightNumber;
        for(int i=1;i<length;i++){
            leftNumber +=nums[i-1];
            leftSum[i]=leftNumber;
        }
        for(int i=length-2;i>=0;i--){
            rightNumber +=nums[i+1];
            rightSum[i]=rightNumber;
        }
        for(int i=0;i<length;i++){
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
        
    }
}
