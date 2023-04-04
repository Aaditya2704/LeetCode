class Solution {
    public String truncateSentence(String s, int k) {
        int len=s.length(),count=0;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<len;i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            if(count==k){
                break;
            }
        
        res.append(s.charAt(i));
        }
        return res.toString();        
    }
}