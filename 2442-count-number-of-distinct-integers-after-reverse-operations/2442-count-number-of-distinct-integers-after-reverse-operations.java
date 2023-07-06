class Solution {
    	public static int reverse(int n){
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + (n % 10);
			n /= 10;
		}
		return reverse;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
		for(int x : nums){
			set.add(x);
			set.add(reverse(x));
		}
		return set.size();
    }
}