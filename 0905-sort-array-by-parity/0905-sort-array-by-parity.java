
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                evenNumbers.add(nums[i]);  
            else
                oddNumbers.add(nums[i]); 
        }
        
        for (int num : oddNumbers) {
            evenNumbers.add(num);
        }
        
        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            result[i] = evenNumbers.get(i);
        }
        
        return result;  
    }
}
