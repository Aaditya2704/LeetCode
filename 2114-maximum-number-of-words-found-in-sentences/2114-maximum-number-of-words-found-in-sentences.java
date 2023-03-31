class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i=0;i<sentences.length;i++){
            String []result=sentences[i].split(" ");
            int length=result.length;
            if(max<length)max=length;
        }
        return max;
    }
}