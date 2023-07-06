class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans='a';
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                ans=letters[i];
            break;
            }
            
        }
        if(ans=='a'){
            return letters[0];
        }else{
            return ans;
        }
    }
}