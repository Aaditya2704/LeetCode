class Solution {
    public String capitalizeTitle(String title) {
        String [] split=title.split(" ");
        String result="";
        for(int i=0;i<split.length;i++){
            split[i]=split[i].toLowerCase();
            if(split[i].length()<=2){
                result+=split[i]+" ";
                continue;
            }else{
                split[i]=split[i].substring(0,1).toUpperCase()+split[i].substring(1);
                result+=split[i]+" ";
            }
        }
        return result.trim();
    }
}