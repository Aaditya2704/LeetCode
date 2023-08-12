class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>mp=new HashMap<>();
        key=key.replace(" ","");
        char ch='a';
        for(char i:key.toCharArray()){
            if(mp.containsKey(i)==false)mp.put(i,ch++);
        }
        StringBuilder sb=new StringBuilder();
        for(char i:message.toCharArray()){
            if(mp.containsKey(i))sb.append(mp.get(i));
            else sb.append(i);
        }
        return sb.toString();
    }
}