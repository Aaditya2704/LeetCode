class Solution {
    public void reverseString(char[] s) {
         int start=0;
        int end=s.length-1;
        while(start<end)
        {
            char ch1=s[start];
            s[start]=s[end];
            s[end]=ch1;
            start++;
            end--;
        }
    }
}