class Solution {
    public int longestContinuousSubstring(String s) {
        int longest=1,current=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1)current++;
            else current=1;
            
            longest=Math.max(longest,current);
        }
        return longest;
    }
}