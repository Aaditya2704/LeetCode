class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split("\s+");
       StringBuilder str = new StringBuilder();
       for(int i = arr.length-1;i>=0;i--){
           str.append(arr[i].trim() + " ");
       }
       return str.toString().trim();
    }
}